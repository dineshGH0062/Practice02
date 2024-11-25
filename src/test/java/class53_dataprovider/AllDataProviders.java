package class53_dataprovider;

import org.testng.annotations.DataProvider;

public class AllDataProviders {

	@DataProvider(name = "appdatafromexcel")
	public static Object[][] testData_excel() 
	{
		Object[][] arr = new Object[3][2];
	
		/*
		 *  get data from excel and map to object array
		 * 
		 */
		
		return arr;
	}

	// high priority
	@DataProvider(name = "appdata")
	public static Object[][] testData() {
		Object[][] arr = new Object[3][2];
		arr[0][0] = "admin@gmail.com";
		arr[0][1] = "admin";

		arr[1][0] = "mukesh@gmail.com";
		arr[1][1] = "admin";

		arr[2][0] = "madhuri@gmail.com";
		arr[2][1] = "admin";

		return arr;
	}

	// high priority
	@DataProvider(name = "validtestdata")
	public static Object[][] testDatanew() {
		Object[][] arr = new Object[1][2];
		arr[0][0] = "admin@email.com";
		arr[0][1] = "admin@123";

		return arr;
	}
	
	@DataProvider(name="Testing")
	public static Object[][] newTest() {
		Object[][] arrwO=new Object[2][2];
		arrwO[0][0]="test1";
		arrwO[0][1]="test2";
		arrwO[1][0]="test3";
		arrwO[1][1]="test4";
		//arrwO[2][0]="test5";
		return arrwO;
		
	}

}
