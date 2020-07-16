package com.zerobank.tests;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.management.Descriptor;

public class LoginTest extends TestBase{
    LoginPage loginPage = new LoginPage();

    @Test(description = "Verify that user successfully login",priority = 1)
    public void loginTest(){
        loginPage.login();
        String expected ="Zero - Account Summary";
        Assert.assertTrue(driver.getTitle().equals(expected));

    }


    @Test(description = "Verify that user can not login with invalid credentials",priority = 2)
    public void loginErrorMessageTest(){
        loginPage.login("usfasfa","asfajsf");
        BrowserUtils.takeScreenshot("errorMessage");
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());

    }

    /// This is a new user story




}
