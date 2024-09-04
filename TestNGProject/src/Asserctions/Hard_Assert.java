package Asserctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {
	@Test
	public void hardassert() {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://duckduckgo.com/");
		String actual_title="DuckDuckGo — Privacy, simplified";
		String expected_title=driver.getTitle();
		Assert.assertEquals(actual_title, expected_title, "incorect title page.");
	}
	@Test
	public void print() {
		System.out.println("Hard Assert is Displayed.");
	}
}
