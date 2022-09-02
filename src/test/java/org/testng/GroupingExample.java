package org.testng;

import org.testng.annotations.Test;

public class GroupingExample {

	@Test(groups = "Smoke")
	private void test1() {
		System.out.println("Method 1");
	}

	@Test(groups = "Smoke")
	private void test2() {
		System.out.println("Method 2");
	}

	@Test(groups = "functional", dependsOnGroups = "retest")
	private void test3() {
		System.out.println("Method 3");
	}

	@Test(groups = "retest")
	private void test4() {
		System.out.println("Method 4");
	}

	@Test(groups = "regression test")
	private void test5() {
		System.out.println("Method 5");
	}

}
