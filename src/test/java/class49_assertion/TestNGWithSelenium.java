package class49_assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGWithSelenium extends BaseClass
{
	
	@Test
	public void loginToApp()
	{
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		driver.findElement(By.className("submit-btn")).click();
		
		WebElement ele=driver.findElement(By.xpath("//h4[@class='welcomeMessage']"));
		
		String welcomemsg=ele.getText();
		
		boolean status=welcomemsg.contains("Welcome");
		
		Assert.assertTrue(status,"Login Failed");
		
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("New user? Signup")).isDisplayed(),"Logout Failed");
		
	}
	

	@Test
	public void verifyURL()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("login"),"could not verify url");
	}
	
	@Test
	public void verifyTitle()
	{
		Assert.assertTrue(driver.getTitle().contains("Automation"),"could not verify title");
	}

}
