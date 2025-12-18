package ParameterizeTestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class UsingmultiBrowser {

	WebDriver driver;
	static {
		System.setProperty("webdriver.chomre.driver", ".//Drivers//chromedriver.exe");
		System.setProperty("webdriver.msedge.driver", ".//Drivers//msedgedriver.exe");
	}
	@Test
	@Parameters("browser")
	public void multibrowser(String browser) throws Exception {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver = new EdgeDriver();
		}
		FileInputStream file = new FileInputStream(".//config.properties");
		Properties p = new Properties();
		p.load(file);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url=p.getProperty("URL");
		driver.get(url);
		String us=p.getProperty("username");
		WebElement uname=driver.findElement(By.id("email"));
		String ps=p.getProperty("password");
		WebElement pname=driver.findElement(By.id("pass"));
		for(int i=0; i<=3; i++) {
			uname.sendKeys(us+i);
			Thread.sleep(1000);
			pname.sendKeys(ps+i);
			Thread.sleep(1000);
		}
		driver.close();
	}
}
