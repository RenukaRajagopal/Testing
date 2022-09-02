package org.installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWork {
	public static void main(String[] args) {
    System.out.println("Renuka Gowrisankar");
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("http:\\facebook.com");
    
    
    
	}

}
