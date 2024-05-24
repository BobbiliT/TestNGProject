package InvocationCountTestCase;

import org.testng.annotations.Test;

public class CountTestCase {

	@Test(invocationCount=10)
	public void test() {
		int a=10; 
		int b=20;
		int c=a+b;
		System.out.println("sum of numbers :"+c);
	}
}
