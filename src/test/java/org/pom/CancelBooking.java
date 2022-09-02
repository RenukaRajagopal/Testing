package org.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends Baseclassmethods{
	
	public CancelBooking(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement bookingID;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookIteratory;
	
	@FindBy(id="order_id_text")
	private WebElement bookingIdSearch;
	
	
	@FindBy(id="search_hotel_id")
	private WebElement goclick;
	
	@FindBy(id="check_all")
	private WebElement clickCheckbox;
	
	@FindBy(xpath="(//input[@class='reg_button'])[1]")
	private WebElement cancelBooking;

	public WebElement getBookingID() {
		return bookingID;
	}


	public WebElement getBookIteratory() {
		return bookIteratory;
	}

	public WebElement getBookingIdSearch() {
		return bookingIdSearch;
	}
	
	public WebElement getGoclick() {
		return goclick;
	}

	public WebElement getClickCheckbox() {
		return clickCheckbox;
	}

	public WebElement getCancelBooking() {
		return cancelBooking;
	}
	
	public void cancelBooking() throws IOException {
		String attribute = getAttribute(getBookingID());
		System.out.println(attribute);
		insertValueinCellExcel("Adactin", 1, 18, attribute);
		elementClick(getBookIteratory());
		elementSendkeys(getBookingIdSearch(), attribute);
		elementClick(getGoclick());
		elementClick(getClickCheckbox());
		elementClick(getCancelBooking());
		alertAccept();
		
	}
		
	}
	
	

