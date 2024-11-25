package class48_getting_started;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.Utility;
import pages.HomePage;
import pages.LoginPage;


@Test
public class LoginTest {
	
	public void testLogin() {
		WebDriver driver = Utility.startBrowser();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginToApp("admin@email.com", "admin@123");
		HomePage homePage=new HomePage(driver);
		Assert.assertTrue(homePage.getWelcomeMsg().contains("Welcome"),"Welcome msg not present");
		
	
	
	
	}

}
