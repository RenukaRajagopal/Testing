package org.junit;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class junitExample {
	
static WebDriver driver;

	
	  @BeforeClass
	  public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	  }
	  
	  @Before
	   public void beforeTest() throws IOException {
           TakesScreenshot shot =(TakesScreenshot) driver;
		   File screenshotAs = shot.getScreenshotAs(OutputType.FILE);
		   System.out.println(screenshotAs);
		   File file =new File("C:\\Users\\Lenovo\\Pictures\\Screenshots\\AdactinbeforeScreenshot.png");
		   FileUtils.copyFile(screenshotAs, file);
	   }
	   @After
	   public void afterTest() throws IOException {
		   TakesScreenshot shot =(TakesScreenshot) driver;
		   File screenshotAs = shot.getScreenshotAs(OutputType.FILE);
		   System.out.println(screenshotAs);
		   File file =new File("C:\\Users\\Lenovo\\Pictures\\Screenshots\\AdactinResult1.png");
		   FileUtils.copyFile(screenshotAs, file);
	   }
	   @Test
	   public void test()  {
		   WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		   username.sendKeys("Renukagowri");
		   WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		   password.sendKeys("Renugopal@30");
		   WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		   login.click();
	   }
	   
	   @AfterClass
		public static void afterClass() {
		   driver.quit();
	   }


}




