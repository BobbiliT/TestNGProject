package TestNGbasicpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleProgram {

	// pre-condition test annotations --- starting with @before
	@BeforeSuite
	public void setup() {
		System.out.println("setup the system chrome browser.");
	}
	@BeforeClass
	public void lunchbrowser() {
		System.out.println("lunch chrome browser.");
	}
	@BeforeTest
	public void login() {
		System.out.println("login to the browser.");
	}
	@BeforeMethod
	public void enterurl() {
		System.out.println("enter url page.");
	}
	@Test
	public void gettittle() {
		System.out.println("get the browser title name.");
	}
	@Test
	public void geturl() {
		System.out.println("get the browser url name.");
	}
	// post-condition test annotation --- @after
	@AfterMethod
	public void closeurl() {
		System.out.println("close url page.");
	}
	@AfterTest
	public void closelogin() {
		System.out.println("close login page.");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("close the browser window.");
	}
	@AfterSuite
	public void generatetestbrowser() {
		System.out.println("generate test browser.");
	}
}
