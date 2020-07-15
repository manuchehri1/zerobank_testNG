package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait;

    public BasePage(){
        PageFactory.initElements(driver,this);
    }


    public void navigateTo(String pageName){
        String xpathLocator = "//a[contains(text(),'"+pageName+"')]";
        //String path = "//a[contains(text(),'Pay Bills')]";
        WebElement payBill = driver.findElement(By.xpath(xpathLocator));
        //WebElement payBillId = driver.findElement(By.id("pay_bills_tab"));

        ////a[contains(text(),'Pay Bills')]


       // wait.until(ExpectedConditions.elementToBeClickable(payBill));
        payBill.click();


    }


}
