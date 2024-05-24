package Asserctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserctionString {

	@Test
	public void facebookset() {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String ext="tejesh";
		String act=driver.getTitle();
		System.out.println(act);
		Assert.assertEquals(ext, act);
		driver.close();
	}
}
