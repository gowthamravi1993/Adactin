package org.stepdefinitionfile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinContinuePage extends AdactinBaseclass {
	AdactinPojoClass p;
	@Given("user launch adactin application")
	public void user_launch_adactin_application() {
		p=new AdactinPojoClass();
	    System.out.println(p.getCurrentPageUrl());
	}
	@When("user select the hotel")
	public void user_select_the_hotel() throws InterruptedException {
		p=new AdactinPojoClass();
		clickElement(p.getRadio());
	}
		
	@Then("user click continue button")	
	public void user_click_continue_button() throws InterruptedException {
		p=new AdactinPojoClass();
	clickElement(p.getcon());
		
	}
}
