package FactoryAnnotaion;

import org.testng.annotations.Test;

public class simple {

	@Test
	public void testfactory() {
		System.out.println("factory annotation.");
	}
}
// @Factory will exceute all the test method inside the test class by using seperate instance of the respective class
//with different set of data