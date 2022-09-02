package org.junit;

import org.testng.annotations.Test;

public class Dependancies {
	@Test(enabled=true)
	public void higherSchool() {
	System.out.println("High School");
	}
	@Test(dependsOnMethods="higherSchool")
	public void higherSecschool() {
	System.out.println("Higher Sec School");
	}
	@Test(dependsOnMethods="higherSecschool")
	public void engineering() {
	System.out.println("Engineering");
	}
	}


