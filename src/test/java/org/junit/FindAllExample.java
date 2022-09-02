package org.junit;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FindAllExample extends Baseclassmethods {
	
	
public FindAllExample() {
		
		PageFactory.initElements(driver, this);
	}
	@CacheLookup//It will be stored in catch memory and will not check dom for each time same id appears. Directly it will give the ouptut from catch memory
	@FindAll({@FindBy(id="username"),@FindBy(xpath="//input[@name='aname']")})//It will act like or operator even though One xpath wrong it will accept
	private WebElement username;
	@CacheLookup
	@FindAll({@FindBy(id="password"),@FindBy(xpath="//input[@name='password']")})
	private WebElement password;
	@CacheLookup
	@FindAll({@FindBy(id="login"),@FindBy(xpath="//input[@name='login']")})
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getlogin() {
		return login;
	}
	
	
	
	public void login(String username,String password) {
		
		
		elementSendkeys(getUsername(), username);
		long currentTimeMillis = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			
		}
		elementSendkeys(getPassword(), password);
		
		elementClick(getlogin());
	}
	


}
