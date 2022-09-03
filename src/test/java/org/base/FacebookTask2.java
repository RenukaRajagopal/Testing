package org.base;

import java.io.IOException;

public class FacebookTask2 extends Baseclassmethods{
	public static void main(String[] args) throws IOException {
		Baseclassmethods b=new Baseclassmethods();
		b.getDriver();
		String dataExcel = b.getDataExcel("TestCase",2,1);
		String dataExcel2 = b.getDataExcel("TestCase",3,1);
		System.out.println(dataExcel);
		b.getUrl("https://www.facebook.com/");
		b.elementSendkeys(b.findByID("email"), dataExcel);
		b.elementSendkeys(b.findByID("pass"), dataExcel2);
		b.elementClick(b.findByName("login"));
		System.out.println("Renuka");
		System.out.println("Renuka");
		System.out.println("Renuka");
		
	}
}
