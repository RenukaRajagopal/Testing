package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample extends Baseclassmethods {
	@BeforeClass
	private void beforeClass() {
	 getDriver();
	 getUrl("https://adactinhotelapp.com/");
	 maximizeWindow();
	 implicitWait(30);
	 
	}
	@Parameters({"username","password","location","hotels","roomtype","roomnos","checkin","checkout","adult","child"})
	@Test(priority=0)
	private void test1(String user,String pass,String location,String hotel,String roomtype,String roomnos,String checkin,String checkout,String adult,String child) {
		
		 elementSendkeys(findByID("username"), user);
		 elementSendkeys(findByID("password"), pass);
		 elementClick(findByID("login"));
		
		selectByVisibleText(findByID("location"), location);
		selectByVisibleText(findByID("hotels"), hotel);
		selectByVisibleText(findByID("room_type"),roomtype);
		selectByVisibleText(findByID("room_nos"),roomnos);
		clear(findByID("datepick_in"));
		elementSendkeys(findByID("datepick_in"), checkin);
		clear(findByID("datepick_out"));
		elementSendkeys(findByID("datepick_out"), checkout);
		selectByVisibleText(findByID("adult_room"),adult);
		selectByVisibleText(findByID("child_room"),child);
		elementClick(findByID("Submit"));
		}
	
	@Parameters({"firstname","lastname","address","cardno","cardtype","expirymonth","expiryyear","cvvno"})
	@Test(priority=1)
	public void test2(String firstname,String lastname,String address,String cardno,String cardtype,String expirymonth,String expiryyear,String cvvno) {
		elementClick(findByID("radiobutton_0"));
		elementClick(findByID("continue"));
		elementSendkeys(findByID("first_name"), firstname);
		elementSendkeys(findByID("last_name"), lastname);
		elementSendkeys(findByID("address"), address);
		elementSendkeys(findByID("cc_num"), cardno); 
		selectByVisibleText(findByID("cc_type"), cardtype);
	
		selectByVisibleText(findByID("cc_exp_month"), expirymonth);
		selectByVisibleText(findByID("cc_exp_year"), expiryyear);
		elementSendkeys(findByID("cc_cvv"), cvvno);
		elementClick(findByID("book_now"));
		
		String attribute = getAttribute(findByID("order_no"));
		System.out.println(attribute);
		
		
	}

	
	@AfterClass
	
	private void afterClass() {
		 quitWindow();
		 
		}
	

}

//<parameter name="username" value="Renukagowri"/>
//<parameter name="password" value="Renugopal@30"/>
// <parameter name="location" value="London"/>
//  <parameter name="hotels" value="Hotel Sunshine"/>
//   <parameter name="roomtype" value="Standard"/>
//    <parameter name="roomnos" value="1 - One"/>
//     <parameter name="checkin" value="30/08/2022"/>
//      <parameter name="checkout" value="31/08/2022"/>
//       <parameter name="adult" value="2 - Two"/>
//        <parameter name="child" value="2 - Two"/>
//       
//<parameter name="firstname" value="Renuka"/>
//<parameter name="lastname" value="Gowri"/>
// <parameter name="address" value="London"/>
//  <parameter name="cardno" value="1234567890123456"/>
//   <parameter name="cardtype" value="VISA"/>
//    <parameter name="expirymonth" value="August"/>
//     <parameter name="expiryyear" value="2022"/>
//      <parameter name="cvvno" value="4444"/>
      
