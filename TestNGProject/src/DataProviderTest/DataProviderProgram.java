package DataProviderTest;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProgram {

	@DataProvider
	public Object[][] databank(){
		Object[][] data = new Object[2][2];
		data[0][0]="tejesh@gmail.com";
		data[0][1]="tej123";
		data[1][0]="b.tejesh@gmail.com";
		data[1][1]="tejes123";
		return data;
	}
	@Test(dataProvider="databank")
	public void login(String us, String ps) {
		System.out.println(us+" ---"+ps);
	}
}
