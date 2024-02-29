package org.stepdefinitionfile;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinBookahotel extends AdactinBaseclass {
AdactinPojoClass p;
@Given("user launch the adactin application")
	public void user_launch_the_adactin_application() {
	p=new AdactinPojoClass();
	System.out.println(p.getCurrentPageUrl());	
	}
@When("user enter the firstname,lastname,Address,credit card number")
public void user_enter_the_firstname_lastname_Address_credit_card_number() {
	p=new AdactinPojoClass();
	enterText(p.getFirstname(), "Gowtham");
	enterText(p.getLastname(),"Ravi");
	enterText(p.getAddressname(),"chennai");
	enterText(p.getCcnum(),"5467865439876543");	
}

@When("user select the credit card type,expiry month,expiry year,enter the cvv number")
public void user_select_the_credit_card_type_expiry_month_expiry_year_enter_the_cvv_number() throws InterruptedException{
	p=new AdactinPojoClass();
	singleDropDownText1(p.getCctype(), "VISA");	
    singleDropDownText1(p.getCcexpmonth(), "May");	
    singleDropDownText1(p.getCcexpyear(), "2028");
    enterText(p.getCccvv(), "1234");
 
}
@When("user select the credit card type,expiry month,expiry year{string}enter the cvv number")
public void user_select_the_credit_card_type_expiry_month_expiry_year_enter_the_cvv_number(String year) {
	p=new AdactinPojoClass();
	singleDropDownText1(p.getCctype(), "VISA");	
    singleDropDownText1(p.getCcexpmonth(), "May");	
    singleDropDownText1(p.getCcexpyear(), year);
    enterText(p.getCccvv(), "1234");
}
@When("user enter the firstname{string},lastname{string},Address{string},credit card number{string}")
public void user_enter_the_firstname_lastname_Address_credit_card_number(String firstname, String lastname, String Address, String creditcardnumber) {
	p=new AdactinPojoClass();
	enterText(p.getFirstname(), firstname);
	enterText(p.getLastname(),lastname);
	enterText(p.getAddressname(),Address);
	enterText(p.getCcnum(),creditcardnumber);	
}

@When("user select the credit card type{string},expiry month{string},expiry year{string}enter the cvv number{string}")
public void user_select_the_credit_card_type_expiry_month_expiry_year_enter_the_cvv_number(String cctype, String month, String year, String cvvnumber) {
	p=new AdactinPojoClass();
	singleDropDownText1(p.getCctype(), cctype);	
    singleDropDownText1(p.getCcexpmonth(), month);	
    singleDropDownText1(p.getCcexpyear(), year);
    enterText(p.getCccvv(), cvvnumber);
}



@When("user click book now button")
public void user_click_book_now_button() throws InterruptedException {
	p=new AdactinPojoClass();
	clickElement(p.getBooknow());
	Thread.sleep(2000);
}
@When("user see the result based on hotel booking page credential type {string}")
public void user_see_the_result_based_on_hotel_booking_page_credential_type(String string) {
	p=new AdactinPojoClass();
	Assert.assertTrue(p.getLogout().isDisplayed());
}
@When("order number is generated")
public void order_number_is_generated() throws InterruptedException {
	p=new AdactinPojoClass();
	System.out.println(getAttributeValue(p.getOrderno(), "value"));
	Thread.sleep(2000);	
}
@Then("user logout the page")
public void user_logout_the_page() throws InterruptedException {
	p=new AdactinPojoClass();
	clickElement(p.getLogout());
	Thread.sleep(3000);
	 closeBrowser();
}

}


