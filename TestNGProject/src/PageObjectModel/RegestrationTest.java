package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegestrationTest {

	@Test 
	public void verification() {
		System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/");
		RegestrationPage1 reg = new RegestrationPage1(driver);
		reg.setclick();
		reg.setfirstname("tejesh");
		reg.setlastname("bobbili");
		reg.setphone("7036060404");
		reg.setmail("bobbilitejeswara42@gmail.com");
		reg.setaddress("rattakanna");
		reg.setcity("ichapuram");
		reg.setstate("ap");
		reg.setpostcode("532312");
		reg.setcountry("india");
		reg.setusername("tejehs123");
		reg.setpassword("tejesh123");
		reg.setrepassword("tejesh123");
		reg.submit();
	}
}
