package com.bdd.stepdefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.bbd.helper.DriverInitializer;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefintion {
	
	WebDriver driver;

	@Given("^I open browser$")
	public void i_open_browser() throws Throwable {
		driver = DriverInitializer.startDriver();
	}

	@And("^I navigate to OrangeHRM live page$")
	public void i_navigate_to_OrangeHRM_live_page() throws Throwable {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@And("^I enter username \"([^\"]*)\"$")
	public void i_enter_username(String arg1) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(arg1);
	}

	@And("^I enter password \"([^\"]*)\"$")
	public void i_enter_password(String arg1) throws Throwable {
		driver.findElement(By.id("txtPassword")).sendKeys(arg1);
	}

	@And("^I click login button$")
	public void i_click_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@And("^I validate and see the success Dashboard page$")
	public void i_validate_and_see_the_success_Dashboard_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I validate and see the Fail Dashboard page$")
	public void i_validate_and_see_the_Fail_Dashboard_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@After
	public void close_the_browser () throws Throwable{
			driver.close();
			driver.quit();
			System.out.println("closing browser..");

}
}