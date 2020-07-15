package com.zerobank.tests;

import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PayBillsTest extends TestBase{
    LoginPage loginPage = new LoginPage();
    PayBillsPage payBillsPage = new PayBillsPage();


    @Test
    public void testNavigateMethod(){
        loginPage.login();
        System.out.println("Verify that it is Summary Page ");
        String expected = "Zero - Account Summary";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
        payBillsPage.navigateTo("Pay Bills");
        String expected2 = "Zero - Pay Bills";
        String actual2 = driver.getTitle();
        Assert.assertEquals(actual2,expected2,"The title verification failed");

    }

}
