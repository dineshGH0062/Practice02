package class52_ddt;

import org.testng.annotations.Test;

public class ParallelMethodDemo2 
{
	
	@Test
	public void test1()
	{
		System.out.println("Class 2 - Executed Test 1 with Thread ID "+Thread.currentThread().getId());
	}
	
	@Test
	public void test2()
	{
		System.out.println("Class 2 - Executed Test 2 with Thread ID "+Thread.currentThread().getId());
	}
	
	@Test
	public void test3()
	{
		System.out.println("Class 2 - Executed Test 3 with Thread ID "+Thread.currentThread().getId());
	}

	@Test
	public void test4()
	{
		System.out.println("Class 2 - Executed Test 4 with Thread ID "+Thread.currentThread().getId());
	}
	
	@Test
	public void test5()
	{
		System.out.println("Class 2 - Executed Test 5 with Thread ID "+Thread.currentThread().getId());
	}
}