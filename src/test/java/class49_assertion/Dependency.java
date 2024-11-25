package class49_assertion;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Dependency 
{
	// @Test annotation calls main method for execution
	
	// Cyclic dependency
	
	@Test
	public void login()
	{
		System.out.println(10/5);
		System.out.println("Login to app");
	}
	
	@Test(dependsOnMethods = "login")
	public void logoutFromApplication()
	{
		System.out.println(10/2);
		System.out.println("Logout");
	}
	
	@Test(dependsOnMethods = {"logoutFromApplication","login"})
	public void closeApp()
	{
		System.out.println("Closing app");
	}

}
