package class51_crossbrowser;

import org.testng.annotations.Test;

public class Sample1 {

	@Test
	public void test1() 
	{
		System.out.println("Current Thread ID " + Thread.currentThread().getId());

		System.out.println("Current Thread Name " + Thread.currentThread().getName());

		System.out.println("Current Thread Priority " + Thread.currentThread().getPriority());
	}

}
