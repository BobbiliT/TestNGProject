package EnableandDisableTestCase;

import org.testng.annotations.Test;

public class EnableTestCase {

	@Test(priority=1, enabled=true)
	public void test1() {
		System.out.println("test case 1.");
	}
	@Test(priority=2, enabled=true)
	public void test2() {
		System.out.println("test case 2.");
	}
	@Test(priority=3, enabled=false)
	public void test3() {
		System.out.println("test case 3.");
	}
	@Test(priority=4, enabled=true)
	public void test4() {
		System.out.println("test case 4.");
	}
}
