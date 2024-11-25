package class49_assertion;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo 
{
	
	// call assertAll at end always
	
	@Test
	public void test1()
	{
		System.out.println("Start");
		
		SoftAssert softAssert=new SoftAssert();
		
		AssertJUnit.assertEquals(12, 12);
		
		AssertJUnit.assertEquals(12.2, 12.2);
		
		AssertJUnit.assertEquals("Mukesh", "Mukesh");
		
		AssertJUnit.assertTrue(true);
		
		AssertJUnit.assertFalse(false);
	
		System.out.println("End");
		
		softAssert.assertAll();
		
	}

}
