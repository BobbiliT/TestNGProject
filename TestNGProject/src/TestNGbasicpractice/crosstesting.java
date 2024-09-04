package TestNGbasicpractice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crosstesting {

	static {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		System.setProperty("webdriver.msedge.driver", ".//Drivers//msedgedriver.exe");
	}
	WebDriver driver ;
	@Test
	@Parameters("browser")
	public void multipule(String browser) throws Exception{
		if(browser.equals("chrome")) {
			driver = new FirefoxDriver();
		}
		else {
			driver = new EdgeDriver();
		}
		FileInputStream file = new FileInputStream(".//config.properties");
		Properties p = new Properties();
		p.load(file);
		String url=p.getProperty("URL");
		driver.get(url);
		String username=p.getProperty("username");
		WebElement us=driver.findElement(By.id("email"));
		String password=p.getProperty("password");
		WebElement ps = driver.findElement(By.id("pass"));
		for(int i=0; i<=3; i++) {
			us.sendKeys(username);
			Thread.sleep(3000);
			ps.sendKeys(password);
			Thread.sleep(3000);
		}
		
	}
}
