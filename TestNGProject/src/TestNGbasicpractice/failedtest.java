package TestNGbasicpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class failedtest {
	
	WebDriver driver;
	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.msedge.driver", ".//Drivers//msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	@AfterTest
	public void aftertest() {
		driver.close();
	}
	@Test
	public void test1() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}
	@Test
	public void test2() {
		driver.findElement(By.name("q")).sendKeys("tejesh");
		driver.findElement(By.id("icon")).click();
	}
	@Test
	public void test3() {
		Assert.fail();
		assert false;
	}
}
