package HybrdenFrameWork;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class testnglistner implements ITestListener{

	base b = new base();
	public void onTestStart(ITestResult result) {
		System.out.println("start of test cases and its details :"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("success of test cases and its details :"+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		String testmethodname=result.getName();
		b.takescreenshots(testmethodname);
	}
	public void skipped(ITestResult result) {
		System.out.println("skipped of test cases and its detalis :"+result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Failure of test cases and its details are : " + result.getName());
	}
}
