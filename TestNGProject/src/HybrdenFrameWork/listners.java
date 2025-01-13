package HybrdenFrameWork;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listners implements ITestListener{
	
	BaseClass bc = new BaseClass();
	
	public void onTestStart(ITestResult result) {
		System.out.println("total test cases start and its details = "+result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("total test cases success and its detials = "+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		String testname = result.getName();
		bc.getscreenshot(testname);
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skip of test cases and its details are : " + result.getName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Failure of test cases and its details are : " + result.getName());
	}
}
