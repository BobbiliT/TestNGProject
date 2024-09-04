package Asserctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {

	@Test
	public void soft_assert() {
		SoftAssert softasserction = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://duckduckgo.com/");
		String actual_title="DuckDuckGo — Privacy, simplified";
		String expected_title=driver.getTitle();
		softasserction.assertEquals(actual_title, expected_title, "incorect title page.");
	}
	@Test
	public void softassert_print() {
		System.out.println("Soft Assert is Displayed.");
	}
}
