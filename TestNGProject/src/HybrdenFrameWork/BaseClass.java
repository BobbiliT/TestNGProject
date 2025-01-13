package HybrdenFrameWork;

import java.io.File;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements IAutoConstant{
	
	public static WebDriver driver;
	
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(EDGE_KEY, EDGE_VALUE);
	}
	
	@BeforeMethod
	public void open_application() {
		driver = new ChromeDriver();
		String url = Lib.getProperty(CONFIG_PATH, "URL");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void close_application() {
		driver.close(); 
	}
	
	public void getscreenshot(String testmethod) {
		Date d = new Date();
		String date=d.toString().replace(":", "");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".//screenshot"+date+"//"+testmethod+"facebook_sh.png");
		try {
			FileUtils.copyFile(src, trg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
