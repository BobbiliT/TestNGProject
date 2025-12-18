package DataProviderTest;

import org.testng.annotations.Test;

public class MyTest {

	private String browser;
	
	public MyTest(String browser) {
		this.browser = browser;
	}
	
	@Test
	public void browser() {
		System.out.println("running on "+browser);
	}
}
