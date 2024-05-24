package InvocationCountTestCase;

import org.testng.annotations.Test;

public class multipluetimetest {

	@Test(priority=1,invocationCount=5)
	public void username() {
		System.out.println("username is :"+"tejesh");
	}
	@Test(priority=2, invocationCount=3)
	public void password() {
		System.out.println("password is :"+"tejesh123");
	}
	@Test(priority=3, invocationCount=2)
	public void login() {
		System.out.println("login the page.");
	}
}
