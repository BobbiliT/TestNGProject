package TestNgListners;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SetBrowser extends Base{

	@Test
	public void test() throws Exception {
		FileInputStream file = new FileInputStream(".//TestData.config");
		Properties p = new Properties();
		p.load(file);
		String url=p.getProperty("URL");
		driver.get(url);
//		String us=p.getProperty("username");
//		driver.findElement(By.id("email")).sendKeys(us);
//		String ps=p.getProperty("password");
//		driver.findElement(By.id("pass")).sendKeys(ps);
//		Thread.sleep(2000);`
		Assert.assertTrue(false);
		
	}
}
