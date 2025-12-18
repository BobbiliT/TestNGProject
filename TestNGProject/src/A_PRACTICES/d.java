package A_PRACTICES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class d {

	public static WebDriver driver;

	@BeforeMethod
	public void lunch_application() {
		System.setProperty("WebDriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
	}

	@DataProvider(name = "fb-testdata")
	public Object[][] dpmethod() {
		Object[][] obj = new Object[3][2];
		obj[0][0] = "tejesh";
		obj[0][1] = "tejesh10";
		obj[1][0] = "teje";
		obj[1][1] = "teje10";
		obj[2][0] = "tej";
		obj[2][1] = "tej10";
		return obj;
	}

	@Test(dataProvider = "fb-testdata")
	public void test(String username, String password) throws Exception {
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
	}

	@AfterMethod
	public void close_application() {
		driver.close();
	}
}
