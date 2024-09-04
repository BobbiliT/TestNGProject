package TestNGbasicpractice;

import java.io.File;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class takescreesnot {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
//		Date d = new Date();
//		String date = d.toString().replace(":", "-");
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src =ts.getScreenshotAs(OutputType.FILE);
//		File trg = new File(".//Drivers//"+date+"flipkartfullpage.png");
		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	    ImageIO.write(s.getImage(),"PNG",new File(".\\Drivers\\fullPageScreenshot.png"));
//  	Files.copy(src, trg);
		Thread.sleep(3000);
		driver.close();
	}
}
