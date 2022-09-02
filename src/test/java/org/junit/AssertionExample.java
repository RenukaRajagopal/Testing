package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionExample {
	static WebDriver driver;
	private boolean contains;
	@Test
	public void testCase() {
		  WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
		  driver.get("https://adactinhotelapp.com/");
		   WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		   username.sendKeys("Renukagowri");
		   
		   String attribute = username.getAttribute("value");
		   Assert.assertEquals("Verify username", "Renukagowri", attribute);
		  
		   WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		   password.sendKeys("Renugopal@30");
		   Assert.assertTrue("Verify password", true);
		   
		   WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		   login.click();
		   
		   String title = driver.getTitle();
		   boolean assertioncontions = title.contains("Adactin.com");
		   System.out.println(assertioncontions);
	}

}
