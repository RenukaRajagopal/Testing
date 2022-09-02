package org.junit;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AdactinJunit extends Baseclassmethods {
	
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		getUrl("https://adactinhotelapp.com/");
		implicitWait(30);
	}
    @Test
    public void testCase() throws IOException, InterruptedException {
    	String username = getDataExcel("Adactin", 1, 0);
		elementSendkeys(findByXpath("//input[@id='username']"), username);
	
		
		String password = getDataExcel("Adactin", 1, 1);
		elementSendkeys(findByID("password"), password);
		
		findByXpath("//input[@id='login']").click();
		
		String location = getDataExcel("Adactin", 1, 2);
		selectByValue(findByXpath("//select[@id='location']"),location);
		
		WebElement logintext = findByID("username_show");
		String attribute2 = getAttribute(logintext);
	     
		
		Assert.assertEquals("Verify the FirstPage", "Hello Renukagowri!", attribute2);
		
		String hotel = getDataExcel("Adactin", 1, 3);
		selectByValue(findByID("hotels"), hotel);
		
		
		
		//String roomtype = a.getDataExcel("Adactin", 1, 4);
		//a.selectByVisibleText(a.findByXpath("//select[@id='room_type']"), roomtype);
		
	 	 String roomtype = getDataExcel("Adactin", 1, 4);
		 selectByIndex(findByXpath("//select[@id='room_type']"), Integer.parseInt(roomtype));
		
		String roomno = getDataExcel("Adactin", 1, 5);
		selectByValue(findByXpath("//select[@id='room_nos']"), roomno);
		
		findByXpath("//input[@id='datepick_in']").clear();
		String checkindate = getDataExcel("Adactin", 1, 6);
		elementSendkeys(findByXpath("//input[@id='datepick_in']"), checkindate);
		
		String checkoutdate = getDataExcel("Adactin", 1, 7);
		findByXpath("//input[@id='datepick_out']").clear();
		elementSendkeys(findByXpath("//input[@id='datepick_out']"), checkoutdate);
		
		String adultroom = getDataExcel("Adactin", 1, 8);
		selectByVisibleText(findByID("adult_room"), adultroom);
		
		String childroom = getDataExcel("Adactin", 1, 9);
		selectByVisibleText(findByID("child_room"), childroom);
		elementClick(findByXpath("//input[@id='Submit']"));
		
		Thread.sleep(3000);
	
		
		WebElement selecthotel = findByXpath("//td[@class='login_title']");
		String attribute3 = selecthotel.getText();
		
		Assert.assertEquals("Verify the SecondPage", "Select Hotel", attribute3);
		
		
		
		elementClick(findByID("radiobutton_0"));
		elementClick(findByID("continue"));
		
		
		
		WebElement bookhotel = findByXpath("//td[text()='Book A Hotel ']");
		String attribute4 = bookhotel.getText();
		
		Assert.assertEquals("Verify the bookhotel", "Book A Hotel", attribute4);
		
		
		String firstname = getDataExcel("Adactin", 1, 10);
		elementSendkeys(findByID("first_name"),firstname);
		
		String lastname = getDataExcel("Adactin", 1, 11);
		elementSendkeys(findByID("last_name"),lastname);
		
		String address = getDataExcel("Adactin", 1, 12);
		elementSendkeys(findByID("address"), address);
		
		String creditcardno = getDataExcel("Adactin", 1, 13);
		elementSendkeys(findByID("cc_num"),creditcardno);
		
		String cardtype = getDataExcel("Adactin", 1, 14);
		selectByVisibleText(findByID("cc_type"),cardtype);
		
		String expirymonth = getDataExcel("Adactin", 1, 15);
		selectByValue(findByID("cc_exp_month"),expirymonth);
		
		String expiryyear = getDataExcel("Adactin", 1, 16);
		selectByVisibleText(findByID("cc_exp_year"),expiryyear);
		
		String cvvno = getDataExcel("Adactin", 1, 17);
		elementSendkeys(findByID("cc_cvv"), cvvno);
		elementClick(findByID("book_now"));
		
		WebElement confirmhotel = findByXpath("//td[text()='Booking Confirmation ']");
		String attribute5 = confirmhotel.getText();
		
		
		Assert.assertEquals("Verify the ConfirmPage", "Booking Confirmation", attribute5);
		
		String attribute = getAttribute(findByXpath("//input[@id='order_no']"));
		System.out.println("Hotel booking ID: "+attribute);
		
		insertValueinCellExcel("Adactin", 1, 18, attribute);
    }
	
	@AfterClass
	public static void afterClass() {
		quitWindow();
			}

}
