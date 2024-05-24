package TestNGbasicpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFacebookchrome {

	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com");
	}
	@Test
	public void GetTitle() {
		String title =driver.getTitle();
		System.out.println("page title :"+title);
	}
	@Test
	public void enterinputs() {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("tejesh");
		String us=username.getAttribute("value");
		System.out.println("username is :"+us);
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("bobbili");
		String pas=password.getAttribute("value");
		System.out.println("password is :"+pas);
	}
	@Test
	public void verifytestboxs() {
		System.out.println("username test box displayed or not :"+driver.findElement(By.id("email")).isDisplayed());
		System.out.println("password test box displayed or not :"+driver.findElement(By.id("pass")).isDisplayed());
	}
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
}
