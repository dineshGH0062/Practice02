package class51_crossbrowser;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo 
{
	
	@Parameters({"browser","version"})
	@Test
	public void test1(@Optional("brave") String browser,@Optional("125")String version)
	{
		System.out.println("Test 1 : "+browser + " Version : "+version);
	}

}
