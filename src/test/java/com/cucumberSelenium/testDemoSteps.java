package com.cucumberSelenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class testDemoSteps {
    @Given("account balance is {double}")
    public void accountBalanceIs(double arg0) {
        System.out.println(arg0);
        Assert.assertTrue(false);
    }

    @When("the account is credited with {double}")
    public void theAccountIsCreditedWith(double arg0) {

        System.out.println(arg0);
        Assert.assertTrue(true);
    }

    @Then("account should have a balance of {double}")
    public void accountShouldHaveABalanceOf(double arg0) {
        Assert.assertTrue(true);
        System.out.println(arg0);
    }

    @Given("an account balance is {double}")
    public void anAccountBalanceIs(double arg0) {
        Assert.assertTrue(true);
        System.out.println(arg0);
    }

    @When("the account is debited with {double}")
    public void theAccountIsDebitedWith(double arg0) {
        Assert.assertTrue(true);
        System.out.println(arg0);
    }

    @Then("account should have a balance of {double} with account holder")
    public void accountShouldHaveABalanceOfWithAccountHolder(double arg0) {
        Assert.assertTrue(true);
        System.out.println(arg0);
    }
}
