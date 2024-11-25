package class53_dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import helper.Utility;



public class DDT 
{

	//https://testng.org/#_parameters_with_dataproviders
	
	@Test(dataProvider = "appdata",dataProviderClass = AllDataProviders.class)
	public void test1(String user,String pass) throws InterruptedException
	{
		
			WebDriver driver= Utility.startBrowser("https://freelance-learn-automation.vercel.app/login");
			
			driver.findElement(By.id("email1")).sendKeys(user);
			
			driver.findElement(By.id("password1")).sendKeys(pass);
			
			Thread.sleep(2000);
			
			driver.quit();
	
	
	}
	
	
}
