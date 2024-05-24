package GroupingTestCase;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups={"sanity"})
	public void test1() {
		System.out.println("group test 1.");
	}
	@Test(groups={"regression"})
	public void test2() {
		System.out.println("group test 2.");
	}
	@Test(groups={"sanity"})
	public void test3() {
		System.out.println("group test 3.");
	}
	@Test(groups={"regression"})
	public void test4() {
		System.out.println("group test 4.");
	}
	@Test(groups={"sanity"})
	public void test5() {
		System.out.println("group test 5.");
	}
	@Test(groups={"sanity","regression"})
	public void test6() {
		System.out.println("group test 6.");
	}
}
