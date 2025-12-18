package DataProviderTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

	@DataProvider(name = "testdata")
	public Object[][] databank() {
		Object[][] obj = new Object[][] { { "tejesh", "tejesh10" }, { "tej", "tej10" }, { "teju", "teju10" } };
		return obj;
	}

	@Test(dataProvider = "testdata")
	public void test(String username, String password) {
		System.out.println("username -> " + username);
		System.out.println("password -> " + password);
	}
}
