package myProject;

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

public class myTest4 {

	@Test(dependsOnMethods = "test11")
	public void test2() {

		System.out.println("2");
	}

	@Test
	public void test11() {

		System.out.println("1");
	}

}
