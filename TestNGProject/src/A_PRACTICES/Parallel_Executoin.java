package A_PRACTICES;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parallel_Executoin {

	public static WebDriver driver;
	@Test
	public void Thread1() {
		System.out.println("Thread 1 is started.");
		System.setProperty("WebDriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println("title of the page - "+title);
		driver.close();
		System.out.println("Thread 1 is ended.");
	}
	
	@Test
	public void Thread2() {
		System.out.println("Thread 2 is started.");
		System.setProperty("WebDriver.msedge.driver", ".//Drivers//msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("title of the page - "+title);
		driver.close();
		System.out.println("Thread 2 is ended.");
	}
}
