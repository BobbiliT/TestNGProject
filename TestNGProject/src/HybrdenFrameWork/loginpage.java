package HybrdenFrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class loginpage extends BaseClass{
	
	@Test
	public void loginfacebook() {
		pompage p = new pompage(driver);
		
		String uname = Lib.getProperty(CONFIG_PATH, "username");
		String pname = Lib.getProperty(CONFIG_PATH, "password");
		
//		String usern=Lib.getCellsValue(EXCEL_PATH, "credintials", 1, 0);
//		String passn=Lib.getCellsValue(EXCEL_PATH, "credintials", 1, 1);
//		
		p.SetUsername(uname);
		p.SetPassword(pname);
		p.clicklogin();
		Assert.fail();
	}
}
