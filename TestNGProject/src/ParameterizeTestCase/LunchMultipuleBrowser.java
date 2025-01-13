package ParameterizeTestCase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LunchMultipuleBrowser {

	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	}
	@Test
	@Parameters("browser")
	public void loginmultiplebrowser(String browser) throws Exception {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		FileInputStream configFile= new FileInputStream("./TestData.config/");
		Properties pro = new Properties();
		pro.load(configFile);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url=pro.getProperty("URL");
		driver.get(url);
		String us=pro.getProperty("username");
		WebElement fus=driver.findElement(By.id("email"));
		String ps=pro.getProperty("password");
		WebElement pps=driver.findElement(By.id("pass"));
		for(int i=0; i<=2; i++) {
			fus.sendKeys(us+i);
			System.out.println(fus.getAttribute("value"));
			Thread.sleep(1000);
			pps.sendKeys(ps+i);
			System.out.println(pps.getAttribute("value"));	
			Thread.sleep(1000);
		}
		driver.close();
	}
	
}
// - execute the test script with multiple set of data by taking data from external source file is know as data parameteriztion
// - we can have multiple approches to access them
// - In testng suite file, what we do is, we have declered and initialize the paramater by using parameter tag
// - once the parameter declered and initialize, we utilize those paramter from any testng class by using @parameter annotation
// - As an argument to the parameter annotation, we need to pass the parameter name which is declered in suite
// - we can access multiple parameter as well by using String array
// - then after we should creating local variable in the test method, we can access these parameter values and utileze in our script
// - this is how, we can access data parameterization in testng suite file.
