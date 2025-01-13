package A_PRACTICES;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipExecption {
	
	@Test
	public void test1() {
		System.out.println("this is test method 1");
	}
	
	@Test
	public void test2() {
		System.out.println("this is test method 2");
		throw new SkipException("this is skip Exception");
	}
	
	@Test(enabled=false)
	public void test3() {
		System.out.println("this is test method 3");
	}
}
