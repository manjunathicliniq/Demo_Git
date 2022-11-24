package TestNG_Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Example_At_Test {


	@Test
	public void verifyHomepageTitle() throws InterruptedException {

		String baseUrl = "https://www.icliniq.com";

		System.out.println("launching firefox browser");
		WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
