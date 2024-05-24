package DependencyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTestCases {

	@Test
	public void bikestart() {
		System.out.println("start the bike.");
	}
	@Test(dependsOnMethods="bikestart")
	public void bikedriving() {
		System.out.println("bike is driving.");
		Assert.fail();
	}
	@Test(dependsOnMethods="bikestart")
	public void bikerunning() {
		System.out.println("bike is running");
	}
	@Test(dependsOnMethods="bikestart")  
	public void bikepark() {                             
		System.out.println("bike will be park.");
	}
}
