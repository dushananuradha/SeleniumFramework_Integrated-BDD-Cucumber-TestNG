package com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class AbstractStepDef {
    public static WebDriver driver;

    @BeforeTest
    protected WebDriver getDriver(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
            driver = new ChromeDriver();

        }
        return driver;
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
        System.out.println("done AfterTest");
    }
}
