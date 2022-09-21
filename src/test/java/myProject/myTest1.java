package myProject;

import org.testng.Assert;
//import org.testng.annotations.Test;
import org.testng.annotations.*;

//BS
//BT
//BC
//BM
//@BeforeSuite
//@AfterSuite
//@BeforeTest
//@AfterTest
//@BeforeGroups
//@AfterGroups
//@BeforeClass
//@AfterClass
//@BeforeMethod
//@AfterMethod

public class myTest1 {

	@AfterSuite
	public void test2() {

		System.out.println("AfterSuite");
	}

	@BeforeSuite
	public void test1() {

		System.out.println("BeforeSuite");
	}

	@Test(priority = 1, groups = "Kiddo")
	public void Dhani() {
		System.out.println("test method-Dhani");
	}

	@BeforeTest
	@Parameters("atul")
	public void test3(String realname) {

		System.out.println("BeforeTest");
		System.out.println(realname);
		//Assert.assertNull(realname); 
		
	}

	@AfterTest
	public void test4() {

		System.out.println("AfterTest");
	}

	@BeforeGroups
	public void test5() {

		System.out.println("BeforeGroups");
	}

	@AfterGroups
	public void test6() {

		System.out.println("AfterGroups");
	}

	@BeforeClass
	public void test7() {

		System.out.println("BeforeClass");
	}

	@AfterMethod
	public void test10() {

		System.out.println("AfterMethod");
	}

	@Test(priority = 3, groups = "Parent")
	public void Atul() {

		System.out.println("Test Method-Atul");
	}

	@Test(priority = 0, groups = "Parent")
	public void Manju() {

		System.out.println("Test Method-Manju");
	}

	@AfterClass
	public void test8() {

		System.out.println("AfterClass");
	}

	@BeforeMethod
	public void test9() {

		System.out.println("BeforeMethod");
	}

}
