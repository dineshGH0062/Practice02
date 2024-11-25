package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By welcomeMsg=By.className("welcomeMessage");
	public String getWelcomeMsg() {
		String welcomeMessage = driver.findElement(welcomeMsg).getText();
		return welcomeMessage;
		
	}

}
