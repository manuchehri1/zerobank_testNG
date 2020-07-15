package com.zerobank.tests;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriverWait wait;
    private Actions actions;
    protected WebDriver driver = Driver.getDriver();




    @BeforeMethod
    public void setup(){
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String URL = ConfigurationReader.getProperty("url");
        driver.get(URL);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,20);

    }


    @AfterMethod
    public void tearDown(){


        driver.quit();

    }


}
