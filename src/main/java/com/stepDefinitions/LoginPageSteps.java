package com.stepDefinitions;

import com.pageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class LoginPageSteps extends AbstractStepDef{
    WebDriver driver = getDriver();
    LoginPage obj_login;

    @Given("User is on Google Home page")
    public void user_is_on_google_home_page() {
        System.out.println("new driver: " + driver);
        driver.navigate().to("https://www.google.com/");
    }

    @Given("User is navigated to SwagLabs Login page")
    public void user_is_navigated_to_swag_labs_login_page() {
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @When("^User enters valid (.*) and (.*)$")
    public void user_enters_valid_standard_user_and_secret_sauce(String username, String password) {
        obj_login = new LoginPage(driver);
        obj_login.enterUserName(username);
        obj_login.enterPassword(password);
    }

    @When("clicks on LOGIN button")
    public void clicks_on_login_button() {
        obj_login.clickOnLogin();
    }

    @Then("User is navigated to SwagLAbs Home page")
    public void user_is_navigated_to_swag_l_abs_home_page() throws InterruptedException {
        driver.getCurrentUrl().contains("https://www.saucedemo.com/inventory.html");
        Thread.sleep(2000);
        driver.quit();
    }

}
