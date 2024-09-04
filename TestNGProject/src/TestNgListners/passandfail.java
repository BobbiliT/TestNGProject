package TestNgListners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class passandfail {

	@Test
	public void test_to_pass() {
		Assert.assertTrue(true);
	}

	@Test
	public void test_to_fail() {
		Assert.assertTrue(false);
	}
	@Test
	public void test_to_pass1() {
		Assert.assertFalse(false);
	}
	@Test
	public void test_to_pass2() {
		Assert.assertFalse(true);
	}
	
}
