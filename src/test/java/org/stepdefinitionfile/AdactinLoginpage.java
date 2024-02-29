	package org.stepdefinitionfile;

import org.openqa.selenium.By;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AdactinLoginpage extends AdactinBaseclass {

	AdactinPojoClass p;
	
	@Given("user launch Adactin application")
	public void user_launch_Adactin_application() {
		
		launch();
		launchUrl("http://adactinhotelapp.com/");
		applyWaitToElements();
		maximizeBrowser();	
	}
	@When("user enter username and password")
	public void user_enter_username_and_password() {
		p = new AdactinPojoClass();
		enterText(p.getElement(), "vaithy2410");
		enterText(p.getEnterpass(), "vaithy@2410");
		applyWaitToElements();
	}
	

	@When("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String  name, String pass) {
	      p=new AdactinPojoClass();
	      enterText(p.getElement(), name);
	      enterText(p.getEnterpass(), pass);
	}

	
	
	  @When("user click login button") public void user_click_login_button() throws	  InterruptedException {
		  p = new AdactinPojoClass(); 
		  clickElement(p.getClkbtn());
	  
	  }
	 
	@Then("user see the result based on credential type {string}")
	public void user_see_the_result_based_on_credential_type(String type) {
	  
	   if (type.equals("positive")) {
		   Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']")).isDisplayed());   
		
	}else {
		Assert.assertTrue(driver.findElement(By.xpath("//b[text()='Invalid Login details or Your Password might have expired. ']")).isDisplayed());
	}
//	   closeBrowser();
	   
	}
	  @SuppressWarnings("deprecation")
	@Then("user see the next page Welcome to Adactin Group of Hotels")
	  public void user_see_the_next_page_Welcome_to_Adactin_Group_of_Hotels() throws
	  InterruptedException { Thread.sleep(2000);
	  
	  Assert.assertTrue(driver.findElement(By.
	  xpath("//td[text()='Welcome to Adactin Group of Hotels']")).isDisplayed());
	  
//	  closeBrowser();
	  }
	  
	 

}
