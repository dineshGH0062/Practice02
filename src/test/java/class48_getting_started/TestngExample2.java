package class48_getting_started;

import org.testng.annotations.Test;

public class TestngExample2 
{
	@Test(priority = 1)
	public void loginToApplication()
	{
		System.out.println("Login To Application");
	}
	
	@Test(priority = 2)
	public void makePayment()
	{
		System.out.println("Payment done by CC");

	}
	
	@Test(priority = 3)
	public void collectReceipt()
	{
		System.out.println("Receipt collected ");

	}
	
	@Test(priority = 4)
	public void logoutFromApplication()
	{
		System.out.println("logout from app");
	}
	
	@Test(priority = 5)
	public void Dinesh() {
		System.out.println("Dinesh");
		
	}
	@Test
 public void Zk() {
	 System.out.println("dddd");
 }
}
