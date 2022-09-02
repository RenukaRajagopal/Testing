package org.testng;

import org.testng.annotations.Test;

public class DependsonGroup {
	@Test
	private void test1() {
		System.out.println("Method 1");
		long id = Thread.currentThread().getId();
		System.out.println(id);
		
	}
	
	@Test
	private void test2() {
		System.out.println("Method 2");
		long id = Thread.currentThread().getId();
		System.out.println("Thread count Method2"+id);
		
	}
	@Test
	private void test3() {
		System.out.println("Method 3");
		long id = Thread.currentThread().getId();
		System.out.println("Thread count Method 3"+id);
		
	}
	@Test
	private void test4() {
		System.out.println("Method 4");
		long id = Thread.currentThread().getId();
		System.out.println("Thread count Method 4"+id);
		
	}
}
