package org.base;

import org.openqa.selenium.WebElement;

public class FacebookusingBclass extends Baseclassmethods {
	public static void main(String[] args) {
		Baseclassmethods a=new Baseclassmethods();
		a.getDriver();
		a.getUrl("https://www.facebook.com\r\n");
		a.elementSendkeys( a.findByID("email"), "Siddharth");
		a.elementSendkeys( a.findByID("pass"), "Gowrisankar");
		a.elementClick(a.findByName("login"));
		
	}
}
