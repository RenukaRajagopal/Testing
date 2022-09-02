package org.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;

public class RetryClass implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer retryanalyzer =annotation.getRetryAnalyzer();
		if(retryanalyzer==null) {
			annotation.setRetryAnalyzer(RetryListener.class);
		
		}
		
	}

}
