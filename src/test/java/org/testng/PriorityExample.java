package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority=6)
	private void beforeSuite() {
		System.out.println("Method 6");
	}
	
	@Test(priority=5,invocationCount = 5)
	private void afterSuite() {
		System.out.println("Method 5");
	}
	
	@Test(priority=4)
	private void beforeClass() {
		System.out.println("Method 4");
	}
	
	
	@Test(priority=3)
	private void afterClass() {
		System.out.println("Method 3");
	}

	@Test(priority=-1)
	private void beforeMethod() {
		System.out.println("Method -1");
	}
	
	@Test(priority=2)
	private void afterMethod() {
		System.out.println("Method 2");
	}
	
	@Test(priority=0)
	private void python() {//Based on alphabetical order it will excute the test case
		System.out.println("Method 0");
	}
	
	@Test(priority=1)
	private void appium() {
		System.out.println("Method 1");
	}
}



