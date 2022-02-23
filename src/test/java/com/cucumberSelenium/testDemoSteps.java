package com.cucumberSelenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromiumDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class testDemoSteps {
    @Given("account balance is {double}")
    public void accountBalanceIs(double arg0) {
        System.out.println(arg0);
        Assert.assertTrue(true);
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

    @Given("test browser")
    public void validateElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.google.com/");

            WebElement elm = driver.findElement(By.name("q"));
            WebElement elm1 = driver.findElement(new By.ByName("q"));
            System.out.println(elm.getAttribute("title"));
            System.out.println(elm1.getAttribute("title"));
//        WebElement elmCss = driver.findElement(By.cssSelector("#gLFyf gsfi"));
//        System.out.println(elmCss.getAttribute("title"));
            elm1.isDisplayed();

            elm.sendKeys("selenium");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOf(elm));
            List<WebElement> elms = driver.findElements(By.className("OBMEnb"));
            System.out.println(elms.get(0).getText());

            driver.findElement(By.xpath("//b[normalize-space()='interview questions']")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//            WebElement elmList = driver.findElement(By.id("122"));
//            Select webSelect = new Select(elmList);
//            webSelect.selectByIndex(1);

            Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofSeconds(5))
                    .ignoring(NoSuchElementException.class);

            WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
                @Override
                public WebElement apply(WebDriver webDriver) {
                    return webDriver.findElement(By.id("123"));
                }
            });

            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
            driver.manage().deleteAllCookies();
            driver.manage().addCookie(new Cookie("232","qweqw"));


        } finally {
            driver.quit();
        }
    }
}
