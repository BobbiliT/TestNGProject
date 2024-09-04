package DependencyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo {

	@Test(priority=1)
	public void creatuser() {
		System.out.println("creat user.");
		Assert.fail();
	}
	@Test(priority=2, dependsOnMethods="creatuser")
	public void deletuser() {
		System.out.println("delet user ");
	}
}
