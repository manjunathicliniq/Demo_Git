package Broken_Site;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	@Test
	public void dropdown() {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://devtest.icliniq.com/ufo/ufoUserSignin");

		driver.findElement(By.name("username")).sendKeys("manjunathan+FirstTest@icliniq.com");
		driver.findElement(By.name("pwd")).sendKeys("@Mn12345");
		driver.findElement(By.id("loginSubmit")).click();

		WebElement dd =driver.findElement(By.cssSelector(".follow-visit-1 > a:nth-child(8) > span:nth-child(1) > i:nth-child(1)"));
				
		//driver.findElement(By.cssSelector(".mt-4 > a:nth-child(1) > div:nth-child(1)")).click();

		Select se = new Select(dd);
     int size =   se.getOptions().size();
     
     System.out.println(size);
	}
}
