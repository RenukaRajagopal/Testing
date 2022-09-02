package org.base;
import java.io.IOException;
public class AdactinExcel extends Baseclassmethods {
	
public static void main(String[] args) throws IOException {
	
		Baseclassmethods a=new Baseclassmethods();
		a.getDriver();
		a.implicitWait(30);
		a.getUrl("https://adactinhotelapp.com/");
		String username = a.getDataExcel("Adactin", 1, 0);
		a.elementSendkeys(a.findByXpath("//input[@id='username']"), username);
		
		String password = a.getDataExcel("Adactin", 1, 1);
		a.elementSendkeys(a.findByID("password"), password);
		a.findByXpath("//input[@id='login']").click();
		
		String location = a.getDataExcel("Adactin", 1, 2);
		a.selectByValue(a.findByXpath("//select[@id='location']"),location);
		
		String hotel = a.getDataExcel("Adactin", 1, 3);
		a.selectByValue(a.findByID("hotels"), hotel);
		
		
		
		//String roomtype = a.getDataExcel("Adactin", 1, 4);
		//a.selectByVisibleText(a.findByXpath("//select[@id='room_type']"), roomtype);
		
		 String roomtype = a.getDataExcel("Adactin", 1, 4);
		 a.selectByIndex(a.findByXpath("//select[@id='room_type']"), Integer.parseInt(roomtype));
		
		String roomno = a.getDataExcel("Adactin", 1, 5);
		a.selectByValue(a.findByXpath("//select[@id='room_nos']"), roomno);
		
		a.findByXpath("//input[@id='datepick_in']").clear();
		String checkindate = a.getDataExcel("Adactin", 1, 6);
		a.elementSendkeys(a.findByXpath("//input[@id='datepick_in']"), checkindate);
		
		String checkoutdate = a.getDataExcel("Adactin", 1, 7);
		a.findByXpath("//input[@id='datepick_out']").clear();
		a.elementSendkeys(a.findByXpath("//input[@id='datepick_out']"), checkoutdate);
		
		String adultroom = a.getDataExcel("Adactin", 1, 8);
		a.selectByVisibleText(a.findByID("adult_room"), adultroom);
		
		String childroom = a.getDataExcel("Adactin", 1, 9);
		a.selectByVisibleText(a.findByID("child_room"), childroom);
		a.elementClick(a.findByXpath("//input[@id='Submit']"));
		
		a.elementClick(a.findByID("radiobutton_0"));
		a.elementClick(a.findByID("continue"));
		
		String firstname = a.getDataExcel("Adactin", 1, 10);
		a.elementSendkeys(a.findByID("first_name"),firstname);
		
		String lastname = a.getDataExcel("Adactin", 1, 11);
		a.elementSendkeys(a.findByID("last_name"),lastname);
		
		String address = a.getDataExcel("Adactin", 1, 12);
		a.elementSendkeys(a.findByID("address"), address);
		
		String creditcardno = a.getDataExcel("Adactin", 1, 13);
		a.elementSendkeys(a.findByID("cc_num"),creditcardno);
		
		String cardtype = a.getDataExcel("Adactin", 1, 14);
		a.selectByVisibleText(a.findByID("cc_type"),cardtype);
		
		String expirymonth = a.getDataExcel("Adactin", 1, 15);
		a.selectByValue(a.findByID("cc_exp_month"),expirymonth);
		
		String expiryyear = a.getDataExcel("Adactin", 1, 16);
		a.selectByVisibleText(a.findByID("cc_exp_year"),expiryyear);
		
		String cvvno = a.getDataExcel("Adactin", 1, 17);
		a.elementSendkeys(a.findByID("cc_cvv"), cvvno);
		a.elementClick(a.findByID("book_now"));
		
		String attribute = a.elementgetAttribute(a.findByXpath("//input[@id='order_no']"));
		System.out.println("Hotel booking ID: "+attribute);
		
		a.insertValueinCellExcel("Adactin", 1, 18, attribute);
		
		
	}

}


