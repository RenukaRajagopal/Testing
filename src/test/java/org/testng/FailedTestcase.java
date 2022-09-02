package org.testng;

import org.testng.annotations.Test;

public class FailedTestcase {
	@Test(retryAnalyzer =RetryListener.class )
	public void test1() {
		Assert.assertTrue(false);
		
		
	}
	
	@Test(retryAnalyzer =RetryListener.class )
	public void test2() {
		Assert.assertTrue(false);
		
		
	}

}
