package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 public static By username=By.id("email1");
	
	 public static By password=By.name("password1");
	
	 public static By loginButton=By.className("submit-btn");
	
	public void loginToApp(String uname,String pass)
	{
		driver.findElement(username).sendKeys(uname);
		
		driver.findElement(password).sendKeys(pass);
		
		driver.findElement(loginButton).click();
	}
}