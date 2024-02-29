package org.stepdefinitionfile;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinSearchHotelPage extends AdactinBaseclass{
	        AdactinPojoClass p;
	        
	  @Given("user enter the adactin search page") 
	  public void use_enter_the_adactin_search_page() {	  
	 System.out.println(driver.getCurrentUrl());
	  }
	 
	@When("user enter the location,enter the hotel,enter the roomtype,enter the numberofrooms")
	public void user_enter_the_location_enter_the_hotel_enter_the_roomtype_enter_the_numberofrooms() throws InterruptedException {
		p= new AdactinPojoClass();
		singleDropDownText1(p.getLocation(),"Sydney");
		singleDropDownText1(p.getHotel(),"Hotel Creek");
		singleDropDownText1(p.getRoomtype(),"Double");
		singleDropDownText1(p.getRoomnos(), "3 - Three");
		
	}
	@When("user enter the check in date and check out date")
	public void user_enter_the_check_in_date_and_check_out_date() {
		p=new AdactinPojoClass();
		clear(p.getDatein());
		enterText(p.getDatein(),"13/09/2023");
		clear(p.getDateout());
		enterText(p.getDateout(), "15/09/2023");
			
	}
	
	
	@When("user enter the adults per room and enter the childrens per room")
	public void user_enter_the_adults_per_room_and_enter_the_childrens_per_room() {
		p=new AdactinPojoClass();
		singleDropDownText1(p.getAdultroom(), "2 - Two");
		singleDropDownText1(p.getChildroom(), "3 - Three");	
	}
	

	
	@When("user enter the location {string},hotel {string},roomtype {string},numberofrooms {string}")
	public void user_enter_the_location_hotel_roomtype_numberofrooms(String location , String hotel, String roomtype, String noofrooms) {
	    p=new AdactinPojoClass();
	    singleDropDownText1(p.getLocation(),location);
		singleDropDownText1(p.getHotel(),hotel);
		singleDropDownText1(p.getRoomtype(),roomtype);
		singleDropDownText1(p.getRoomnos(), noofrooms);
		
	}
	@When("user enter the check in date {string},check out date {string}")
	public void user_enter_the_check_in_date_check_out_date(String checkindate, String checkoutdate) {
		p=new AdactinPojoClass();
		clear(p.getDatein());
		enterText(p.getDatein(),checkindate);
		clear(p.getDateout());
		enterText(p.getDateout(),checkoutdate);	
	}

	@When("user enter the adults per room {string},childrens per room {string}")
	public void user_enter_the_adults_per_room_childrens_per_room(String adultsperroom, String childrenperroom) {
		p=new AdactinPojoClass();
		singleDropDownText1(p.getAdultroom(), adultsperroom);
		singleDropDownText1(p.getChildroom(), childrenperroom);	
	}

	@Then("user see the result based on searchpage credential{string}")
	public void user_see_the_result_based_on_credential(String string) throws InterruptedException {
	   Thread.sleep(3000);
	   Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Please Select a Location']")).isDisplayed());
	   Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Select Hotel ']")).isDisplayed());
	}
	
	
    @When("user click search button")
    public void user_click_search_button() throws InterruptedException {
    	p=new AdactinPojoClass();
    	clickElement(p.getSubmitbtn());
    	Thread.sleep(3000);
    }
    @Then("user see the message next page of the select page")
    public void user_see_the_message_next_page_of_the_select_page() throws InterruptedException {
    	Thread.sleep(3000);
    	Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Select Hotel ']")).isDisplayed());
  
    }
    
    
    
    

}
