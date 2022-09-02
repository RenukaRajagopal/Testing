package org.testng;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdactinDataProvider extends Baseclassmethods {

	@Test(dataProvider = "exceldata")
	public void test(String user, String pass) { 

		getDriver();
		getUrl("https://adactinhotelapp.com/");
		implicitWait(30);
		elementSendkeys(findByID("username"), user);
		elementSendkeys(findByID("password"), pass);
		elementClick(findByID("login"));

	}

	@DataProvider
	public Object[][] exceldata() throws IOException {
		return new Object[][] { { getDataExcel("Adactin", 1, 0), getDataExcel("Adactin", 1, 1) },
				{ getDataExcel("Adactin", 2, 0), getDataExcel("Adactin", 2, 1) },
				{ getDataExcel("Adactin", 3, 0), getDataExcel("Adactin", 3, 1) },
				{ getDataExcel("Adactin", 4, 0), getDataExcel("Adactin", 4, 1) }};
	}

}
