package DataProviderTest;

import org.testng.annotations.Factory;

public class Factorydata {

	@Factory
	public Object[] creatinstance() {
		return new Object[]{
			new MyTest("chrome"),
			new MyTest("firefox"),
			new MyTest("edge")
		};
	}
}
