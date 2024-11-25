package class50_xmlfiles_annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
	
	@BeforeMethod
	public void setup()
	{
		System.out.println("Before Method Executed");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("After Method Executed");
	}

	@BeforeClass
	public void setupClass()
	{
		System.out.println("Before Class Executed");
	}
	
	@AfterClass
	public void tearDownClass()
	{
		System.out.println("After Class Executed");
	}
	
	@BeforeTest
	public void setupTest()
	{
		System.out.println("Before Test Executed");
	}
	
	@AfterTest
	public void tearDownTest()
	{
		System.out.println("After Test Executed");
	}


	@BeforeSuite
	public void setupSuite()
	{
		System.out.println("Before Suite Executed");
	}
	
	@AfterSuite
	public void tearDownSuite()
	{
		System.out.println("After Suite Executed");
	}

}
