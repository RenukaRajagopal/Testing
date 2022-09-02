package org.installation;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

public class AdactinusingBclass   {
	public static void main(String[] args) throws IOException {
	    Baseclassmethods a=new Baseclassmethods();
		a.getDriver();
		a.implicitWait(30);
		a.getUrl("https://adactinhotelapp.com/");
		String username = a.getDataExcel("Adactin", 1, 0);
		a.elementSendkeys(a.findByXpath("//input[@id='username']"), "Greens");
		a.elementSendkeys(a.findByID("password"), "Hello@1234567");
		a.findByXpath("//input[@id='login']").click();
		
		a.selectByValue(a.findByXpath("//select[@id='location']"),"London");
		a.selectByValue(a.findByID("hotels"), "Hotel Sunshine");
		a.selectByIndex(a.findByXpath("//select[@id='room_type']"), 3);
		a.selectByValue(a.findByXpath("//select[@id='room_nos']"), "3");
		a.findByXpath("//input[@id='datepick_in']").clear();
		a.elementSendkeys(a.findByXpath("//input[@id='datepick_in']"), "30/08/2022");
		a.findByXpath("//input[@id='datepick_out']").clear();
		a.elementSendkeys(a.findByXpath("//input[@id='datepick_out']"), "31/08/2022");
		a.selectByVisibleText(a.findByID("adult_room"), "1 - One");
		a.selectByVisibleText(a.findByID("child_room"), "2 - Two");
		a.elementClick(a.findByXpath("//input[@id='Submit']"));
		
		a.elementClick(a.findByID("radiobutton_0"));
		a.elementClick(a.findByID("continue"));
		
		a.elementSendkeys(a.findByID("first_name"),"Siddharth");
		a.elementSendkeys(a.findByID("last_name"),"Gowrisankar");
		a.elementSendkeys(a.findByID("address"),"No.22,Madipakkam,Chennai-600021");
		a.elementSendkeys(a.findByID("cc_num"),"1234567890123456");
		a.selectByVisibleText(a.findByID("cc_type"),"American Express");
		
		a.selectByValue(a.findByID("cc_exp_month"),"8");
		a.selectByVisibleText(a.findByID("cc_exp_year"),"2022");
		a.elementSendkeys(a.findByID("cc_cvv"), "4444");
		a.elementClick(a.findByID("book_now"));
		
		String attribute = a.getAttribute(a.findByXpath("//input[@id='order_no']"));
		System.out.println("Hotel booking ID: "+attribute);
		
	}

}