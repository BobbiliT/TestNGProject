package PriorityTestCases;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority=1)
	public void test1() {
		System.out.println("test case 1.");
	}
	@Test(priority=4)
	public void test2() {
		System.out.println("test case 2.");
	}
	@Test(priority=3)
	public void test3() {
		System.out.println("test case 3.");
	}
	@Test(priority=2)
	public void test4() {
		System.out.println("test case 4");
	}
}
