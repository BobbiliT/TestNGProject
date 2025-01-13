package A_PRACTICES;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser_Testing {

	public static WebDriver driver;
	
	@Test
	public void cross_test() {
		System.out.println(driver.getTitle());
	}
	
	@Parameters("browser")
	@BeforeMethod
	public void Before_method(String browser) {
		System.out.println("this test is started "+browser+"browser");
		switch(browser) {
		case "chrome" :
			System.setProperty("WebDriver.chrome.driver", ".//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "edge" :
			System.setProperty("WebDriver.msedge.driver", ".//Drivers//msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "firefox" :
			System.setProperty("WebDriver.gecko.driver", ".//Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void after_method() {
		driver.close();
	}
}
