package HybrdenFrameWork;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class base implements IAutoconstant{
	
	public static WebDriver driver;
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(EDGE_KEY, EDGE_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	@BeforeMethod
	@Parameters("browser")
	public void openapplication(String browser) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		String url=lib.getproperty(CONFIG_PATH, "URL");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeapplication() {
		driver.close();
	}
	public void takescreenshots(String testmethod) {
		Date d = new Date();
		String date=d.toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".//screenshots//"+date+"//"+testmethod+"screen_shot.png");
		try {
			FileUtils.copyFile(src, trg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
