package TestNgListners;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class utilshot extends Base{

	public void getscreenshot() throws Exception {
		Date d = new Date();
		String date=d.toString().replace(" ", "-").replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".//screenshot//"+date+"amazon.png");
		Files.copy(src, trg);
		Thread.sleep(1000);
		
	}
}
