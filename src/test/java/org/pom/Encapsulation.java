package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Encapsulation extends Baseclassmethods{
//	@FindBy(id="uujdffkdhifhk")
//	private WebElement username;
//
//	public WebElement getUsername() {
//		return username;
//	}

	public void operation(String username) {
		elementSendkeys(findByID("username"), username);
		
	}
	}

	
	


