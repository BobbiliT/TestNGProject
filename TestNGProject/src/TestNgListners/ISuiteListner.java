package TestNgListners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.Reporter;

public class ISuiteListner implements ISuiteListener {
	
	public void onStart(ISuite suite) {
		Reporter.log("Suite start here - "+suite.getName(), true);
	}
	
	public void onFinish(ISuite suite) {
		Reporter.log("Suite finish here - "+suite.getName(),true);
	}
}
