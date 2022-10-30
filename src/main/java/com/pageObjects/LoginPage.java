package com.pageObjects;

import com.stepDefinitions.AbstractStepDef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import static com.supportiveTests.BaseTests.driver;

public class LoginPage extends AbstractStepDef {
    WebDriver driver = getDriver();

    public LoginPage(WebDriver driver) {
        this.driver= driver;
    }

    By txt_username = By.xpath("//input[@id='user-name']");
    By txt_password = By.xpath("//input[@id='password']");
    By btn_login = By.xpath("//input[@id='login-button']");

    public void enterUserName(String username){
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickOnLogin(){
        driver.findElement(btn_login).click();
    }


}
