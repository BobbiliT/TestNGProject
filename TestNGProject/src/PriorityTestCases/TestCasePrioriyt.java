package PriorityTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCasePrioriyt {

	WebDriver driver; 
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}
	@Test(priority=1)
	public void getTitle() {
		String title =driver.getTitle();
		System.out.println("title name :"+title);
	}
	@Test(priority=2)
	public void getUrl() {
		String url=driver.getCurrentUrl();
		System.out.println("url name :"+url);
	}
	@Test(priority=3)
	public void getusername() {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("tejesh");
		System.out.println("username :"+username.getAttribute("value"));
	}
	@Test(priority=4)
	public void getpassword() {
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("tejesh123");
		System.out.println("password :"+password.getAttribute("value"));
	}
	@Test(priority=5)
	public void test5() {
		System.out.println("test no-5.");
	}
	@Test(priority=6)
	public void test6() {
		System.out.println("test no-6.");
	}
	@Test(priority=7)
	public void test7() {
		System.out.println("test no-7");
	}
	@AfterMethod
	public void quitebrowser() {
		driver.quit();
	}
}
