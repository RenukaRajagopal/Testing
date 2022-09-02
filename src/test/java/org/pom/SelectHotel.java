package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Baseclassmethods{
	
	public SelectHotel(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindBy(id="radiobutton_0")
	private WebElement clickbutton;
	
	
	@FindBy(id="continue")
	private WebElement continuebutton;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement getClickbutton() {
		return clickbutton;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	
	public void selectHotel(String location,String hotel,String roomtypes,String roomno,String checkin,
			String checkout,String adultroomcount,String childroomcount) {
		
		selectByVisibleText(getLocation(), location);
		selectByVisibleText(getHotels(), hotel);
		selectByVisibleText(getRoomtype(),roomtypes);
		selectByVisibleText(getRoomnos(),roomno);
		clear(getCheckInDate());
		elementSendkeys(getCheckInDate(),checkin);
		clear(getCheckOutDate());
		elementSendkeys(getCheckOutDate(),checkout);
		selectByVisibleText(getAdultroom(), adultroomcount);
		selectByVisibleText(getChildroom(), childroomcount);
		elementClick(getSubmit());
		elementClick(getClickbutton());
		elementClick(getContinuebutton());
	}
	

}
