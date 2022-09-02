package org.testng;

import org.testng.annotations.Test;

public class DependsonGroup2 {
	@Test
	private void test11() {
		System.out.println("Method 11");
		long id = Thread.currentThread().getId();
		System.out.println("Thread count Method 11"+id);
		
	}
	
	@Test
	private void test22() {
		System.out.println("Method 22");
		long id = Thread.currentThread().getId();
		System.out.println("Thread count Method 22"+id);
		
	}
	@Test
	private void test33() {
		System.out.println("Method 33");
		long id = Thread.currentThread().getId();
		System.out.println("Thread count Method 33"+id);
		
	}
	@Test
	private void test44() {
		System.out.println("Method 44");
		long id = Thread.currentThread().getId();
		System.out.println("Thread count Method 44"+id);
		
	}


}
