package org.junit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationHierarchyexample {
	@Test
	public void drink(){
	System.out.println("It is Test");
	}
	@Test
	public void drink1(){
	System.out.println("It is Test1");
	}
	@BeforeSuite
	public void beforeSuite(){
	System.out.println("It is BeforeSuite");
	}
	@AfterSuite
	public void afterSuite(){
	System.out.println("It is AfterSuite");
	}
	@BeforeClass
	public void beforeClass(){
	System.out.println("It is BeforeClass");
	}
	@AfterClass
	public void afterClass(){
	System.out.println("It is AfterClass");
	}
	@BeforeMethod
	public void beforeMethod(){
	System.out.println("It is BeforeMethod");
	}
	@AfterMethod
	public void afterMethod(){
	System.out.println("It is AfterMethod");
	}

}
