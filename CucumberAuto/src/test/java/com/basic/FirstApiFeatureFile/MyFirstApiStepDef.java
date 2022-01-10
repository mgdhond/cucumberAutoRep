package com.basic.FirstApiFeatureFile;


import org.apache.http.HttpRequest;
import org.junit.Assert;
import org.junit.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.restassured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.path.json.*;



public class MyFirstApiStepDef {

	Response res;
  @Test	
  @Given("^Employee Id$")
  public void given() throws Throwable {
	  RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee";
	  RequestSpecification httpRequest = RestAssured.given();
	   res = httpRequest.get("1");	  	  
	 }
  
  @Test
  @When("^Employee Data is returned$")
  public void when() throws Throwable {
	  
	  int status = res.getStatusCode();
	  System.out.println("response code is " + status);
  }
	  

  @Test
  @Then("^Employee Age is validated$")
  public void then() throws Throwable {
	  System.out.println(res.asString());
	  JsonPath resEvaluator = res.jsonPath();
	  int age = resEvaluator.get("data.employee_age");
	  Assert.assertEquals(61, age);
  }

}
