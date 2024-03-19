package com.naveenautomation.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.naveenautomation.TestBase.TestBase;

public class RetryAnalyser extends TestBase implements IRetryAnalyzer {

	int count = 0;

	int maxCnt = 2;

	@Override
	public boolean retry(ITestResult result) {

		if (count < maxCnt) {
			logger.info("Test failed, Retrying for " + count + " ,Test Name : " + result.getMethod().getMethodName());
			count++;
			return true;
		}

		return false;
	}

}
