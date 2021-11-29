package com.cucumberSelenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testDemoSteps {
    @Given("account balance is {double}")
    public void accountBalanceIs(double arg0) {
        System.out.println(arg0);
    }

    @When("the account is credited with {double}")
    public void theAccountIsCreditedWith(double arg0) {
        System.out.println(arg0);
    }

    @Then("account should have a balance of {double}")
    public void accountShouldHaveABalanceOf(double arg0) {
        System.out.println(arg0);
    }
}
