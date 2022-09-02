package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrderofexecutiontestNG {
	@BeforeSuite
	private void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@AfterSuite
	private void afterSuite() {
		System.out.println("After suite");
	}
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("Before class");
	}
	
	
	@AfterClass
	private void afterClass() {
		System.out.println("After class");
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test(priority=0)
	private void python() {    //Based on alphabetical order it will excute the test case
		System.out.println("Python");
	}
	
	@Test(priority=1)
	private void appium() {
		System.out.println("Appium");
	}
}
