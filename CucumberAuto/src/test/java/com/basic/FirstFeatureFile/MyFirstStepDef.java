package com.basic.FirstFeatureFile;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyFirstStepDef {
	
	//WebDriver driver;
	
	@Given("^User on Facebook login page$")
	public void user_needs_to_be_on_Facebook_loginpage() {
		/*System.setProperty("webdriver.chrome.driver", "C:\\udemy\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/:");
		throw new PendingException();*/
		System.out.println("In Given");
	}
	
	@When("^User enters first name$")
	public void user_enters_first_name() {
		//driver.findElement(By.xpath("//input[@id='u_0_1']")).sendKeys("David");
		System.out.println("In When");
	}
	
	@Then("^User checks first name is displayed$")
	public void user_checks_first_name_is_displayed() {
		//String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_1']")).getAttribute("value");
		//Assert.assertEquals("David", userNameActual);
		System.out.println("In Then");
	}

}
