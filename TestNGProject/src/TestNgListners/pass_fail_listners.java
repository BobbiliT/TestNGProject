package TestNgListners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class pass_fail_listners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("start of test cases and its details -> "+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("success of test cases and its detials -> "+result.getName());
	}
	public void onTestFailure(ITestResult result ) {
		System.out.println("failure of test cases and its detials -> "+result.getName());
	}
	public void onTestSkipped(ITestResult result ) {
		System.out.println("skipped of test cases and its detials -> "+result.getName());
	}
	public void onTestFailureButWithinSuccessPercentage(ITestResult result) {
		System.out.println("success percentage of test cases and its details -> "+result.getName());
	}
}
