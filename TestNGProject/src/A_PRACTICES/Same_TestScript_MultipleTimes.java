package A_PRACTICES;

import org.testng.annotations.Test;

public class Same_TestScript_MultipleTimes {

	@Test(invocationCount=3)
	public void test1() {
		System.out.println("This is the test1");
	}
	
	@Test(invocationCount=4)
	public void test2(){
		System.out.println("This is the test2");
	}
	
	@Test(invocationCount=5)
	public void test3() {
		System.out.println("This is the test3");
	}
	
}
