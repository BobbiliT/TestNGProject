package Data_Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class With_Suite_File {

	@Test
	@Parameters({ "username", "password" })
	public void datapar(String username, String password) {
		System.out.println("username -> " + username);
		System.out.println("password -> " + password);
	}
}
