package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends Baseclassmethods {
	
	public BookHotelPage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
    private WebElement firstName;
	
	@FindBy(id="last_name")
    private WebElement lastName;
	
	@FindBy(id="address")
    private WebElement address;
	
	@FindBy(id="cc_num")
    private WebElement creditCardno;
	
	@FindBy(id="cc_type")
    private WebElement creditCardtype;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
    private WebElement expiryMonth;
	
	@FindBy(id="cc_exp_year")
    private WebElement expiryYear;
	
	@FindBy(id="cc_cvv")
    private WebElement cvvNumber;
	
	
	@FindBy(id="book_now")
	private WebElement submit;
	

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardno() {
		return creditCardno;
	}

	public WebElement getCreditCardtype() {
		return creditCardtype;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	
	public WebElement getSubmit() {
		return submit;
	}

	public void bookHotel(String firstname,String lastname,String address,String creditcardno,String creditcardtype,String expirymonth,String expiryyear,String cvvno) {
	elementSendkeys(getFirstName(),firstname);
	elementSendkeys(getLastName(), lastname);
	elementSendkeys(getAddress(), address);
	elementSendkeys(getCreditCardno(), creditcardno);
	elementSendkeys(getCreditCardtype(), creditcardtype);
	selectByVisibleText(getExpiryMonth(), expirymonth);
	elementSendkeys(getExpiryYear(), expiryyear);
	elementSendkeys(getCvvNumber(), cvvno);
	elementClick(getSubmit());
}
	
}
