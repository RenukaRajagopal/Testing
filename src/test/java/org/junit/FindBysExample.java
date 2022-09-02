package org.junit;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FindBysExample extends Baseclassmethods {
	
	public FindBysExample() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(id="username"),@FindBy(xpath="//input[@name='username']")})
	private WebElement username;
	
	@FindBys({@FindBy(id="password"),@FindBy(xpath="//input[@name='password']")})
	private WebElement password;
	
	@FindBys({@FindBy(id="login"),@FindBy(xpath="//input[@name='login']")})
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
		elementSendkeys(getPassword(), password);
		elementClick(getlogin());
	}
	
	
	
	

}
