package A_PRACTICES;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization {

	@Test
	@Parameters({ "username", "password" })
	public void details(String username, String password) {
		System.out.println("username " + username);
		System.out.println("password " + password);
	}
}
