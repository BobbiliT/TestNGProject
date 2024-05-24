package TestNgListners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners extends utilshot implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Start of test cases and its details are : " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Success of test cases and its details are : " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			getscreenshot();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Skip of test cases and its details are : " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Failure of test cases and its details are : " + result.getName());
	}

}
