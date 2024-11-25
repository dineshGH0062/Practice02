package class49_assertion;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

public class AssertionInTestNG 
{
	
	//java.lang.AssertionError - if assert fails
	
	// Hard Assertion
	
	@Test
	public void test1()
	{
		System.out.println("Start");
		
		int actual=10;
		
		int expected=10;
		
		Assert.assertEquals(actual, expected , "Validation Failed");
	
		System.out.println("Exit");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Start");
		
		Assert.assertEquals("Mukesh", "Mukesh", "Validation Failed");
	
		System.out.println("Exit");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Start");
		
		List<String> l1=Arrays.asList("Java","JavaScript");
		
		List<String> l2=Arrays.asList("Java","JavaScript","Ruby");
		
		Assert.assertNotEquals(l1,l2, "Validation Failed");
	
		System.out.println("Exit");
	}
	
	@Test
	public void test4()
	{
		System.out.println("Start");
		
		String str="Welcome To Selenium World";
		
		Assert.assertTrue(str.contains("Selenium"), "Validation Fail");
	
		System.out.println("Exit");
	}
	
	@Test
	public void test5()
	{
		System.out.println("Start");
		
		String str="Welcome To Selenium World";
		
		Assert.assertFalse(str.contains("selenium"), "Validation Fail");
	
		System.out.println("Exit");
	}

}
