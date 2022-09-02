package org.testng;

public class RetryListener implements IRetryAnalyzer{

	
	int failedcount=0;
	int limit=4;
	public boolean retry(ITestResult result) {
		if(limit<failedcount) {
			failedcount++;
			return true;
		}
		return false;
	}

}
