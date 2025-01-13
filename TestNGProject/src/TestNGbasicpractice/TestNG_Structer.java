package TestNGbasicpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Structer {

	@Test
	public void test1() {
		System.out.println("this is @Test1 annotion running.");
	}
	
	@Test
	public void test2() {
		System.out.println("this is @Test2 annotion running.");
	}
	
	@Test
	public void test3() {
		System.out.println("this is @Test3 annotion running.");
	}
	
	@Test
	public void test4() {
		System.out.println("this is @Test4 annotion running.");
	}
	
	@BeforeMethod
	public void before_method() {
		System.out.println("this is @BeforeMethod annotion running.");
	}
	
	@AfterMethod
	public void after_method() {
		System.out.println("this is @AfterMethod annotion running.");
	}
	
	@BeforeClass
	public void before_class() {
		System.out.println("this is @BeforeClass annotion running.");
	}
	
	@AfterClass
	public void after_class() {
		System.out.println("this is @AfterClass annotion running.");
	}
	
	@BeforeTest
	public void before_test() {
		System.out.println("this is @BeforeTest annotion running.");
	}
	
	@AfterTest
	public void after_test() {
		System.out.println("this is @AfterTest annotion running.");
	}
	
	@BeforeSuite
	public void before_suite() {
		System.out.println("this is @BeforeSuite annotion running.");
	}
	
	@AfterSuite
	public void after_suite() {
		System.out.println("this is @AfterSuite annotion running.");
	}
	
	@BeforeGroups
	public void before_groups() {
		System.out.println("this is @BeforeGroups annotion running.");
	}
	
	@AfterGroups
	public void after_gropus() {
		System.out.println("this is @AfterGropus annotion running.");
	}
}
