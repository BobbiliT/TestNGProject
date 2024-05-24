package Asserctions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserctionint {

	@Test
	public void asetint() {
		int a=10;
		int b=20;
		int c=a+b;
		Assert.assertEquals(40, c, "result is not equal");
	}
}
