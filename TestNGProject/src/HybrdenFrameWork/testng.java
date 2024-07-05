package HybrdenFrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testng extends base {
	
	logindetails l = new logindetails(driver);
	@Test
	public void facebooklogin() {
		String uname=lib.getproperty(CONFIG_PATH, "username");
		String pname=lib.getproperty(CONFIG_PATH, "password");
		l.Setusername(uname);
		l.Setpassword(pname);
		l.click();
		Assert.fail();
	}
}
