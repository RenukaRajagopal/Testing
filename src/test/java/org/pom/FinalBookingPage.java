package org.pom;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FinalBookingPage extends Baseclassmethods {

	@BeforeClass
	public static void beforeClass() {
		getDriver();
		getUrl("https://adactinhotelapp.com/");
		maximizeWindow();
		implicitWait(30);
	}

	@Test

	public void hotelBooking() throws IOException {
		LoginPage loginpage = new LoginPage();
		loginpage.login(getDataExcel("Adactin", 1, 0), getDataExcel("Adactin", 1, 1));

		SelectHotel selecthotel = new SelectHotel();
		selecthotel.selectHotel(getDataExcel("Adactin", 1, 2), getDataExcel("Adactin", 1, 3),
				getDataExcel("Adactin", 1, 4), getDataExcel("Adactin", 1, 5), getDataExcel("Adactin", 1, 6),
				getDataExcel("Adactin", 1, 7), getDataExcel("Adactin", 1, 8), getDataExcel("Adactin", 1, 9));

		BookHotelPage bookhotel = new BookHotelPage();
		bookhotel.bookHotel(getDataExcel("Adactin", 1, 10), getDataExcel("Adactin", 1, 11),
				getDataExcel("Adactin", 1, 12), getDataExcel("Adactin", 1, 13), getDataExcel("Adactin", 1, 14),
				getDataExcel("Adactin", 1, 15), getDataExcel("Adactin", 1, 16), getDataExcel("Adactin", 1, 17));

		CancelBooking cancel = new CancelBooking();
		cancel.cancelBooking();

	}

	@AfterClass
	public static void afterClass() {
		quitWindow();
	}

}
