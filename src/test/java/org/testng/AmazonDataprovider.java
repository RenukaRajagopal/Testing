package org.testng;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonDataprovider extends Baseclassmethods {
	
	
	@Test(dataProvider="getdata")
	private void test(String search) {
		getDriver();
		getUrl("https://www.amazon.com/");
		maximizeWindow();
		implicitWait(30);
		elementSendkeys(findByID("twotabsearchtextbox"),search);
		elementClick(findByID("nav-search-submit-button"));
		quitWindow();
	}
	@DataProvider
	public Object[][] getdata(){
		
		Object[][] data=new Object[10][1];
		data[0][0]="Babywalker";
		data[1][0]="Kids wear";
		data[2][0]="Women clothes";
		data[3][0]="Mens clothes";
		data[4][0]="Decor items";
		data[5][0]="laptops";
		data[6][0]="Women watches";
		data[7][0]="Mens watches";
		data[8][0]="Ear phones";
		data[9][0]="Mobiles";
		
		return data;
		
	}
	}
	

