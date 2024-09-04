package DependencyTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class smoketesting {

	@Test(priority=1,groups= {"user","smoke"})
	public void creatuser() {
		Reporter.log("creatuser", true);
	}
	@Test(priority=2, invocationCount=1, enabled=true, groups= {"user"})
	public void edituser() {
		Reporter.log("edituser", true);
	}
	@Test(priority=3, groups= {"user"})
	public void deletuser() {
		Reporter.log("deletuser", false);
	}
	@Test(priority=1, groups= {"product","smoke"})
	public void creatproduct() {
		Reporter.log("creatproduct", true);
	}
	@Test(priority=2, invocationCount=1, enabled=true, groups= {"product"})
	public void editproduct() {
		Reporter.log("edituser", true);
	}
	@Test(priority=3,groups= {"product"})
	public void deletproduct() {
		Reporter.log("deletproduct", true);
	}
}
