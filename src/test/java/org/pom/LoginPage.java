package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclassmethods{
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public void login(String username,String pass) {
		elementSendkeys(getUserName(), username);
		elementSendkeys(getPassWord(), pass);
		elementClick(getLogin());
	}
	

}
