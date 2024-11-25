package class49_assertion;

import org.testng.annotations.AfterMethod;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.out.println("Setting up browser");
		driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	
	@AfterMethod
	public void tearDown() {
		System.out.println("Closing browser");
		driver.quit();
	}
}
