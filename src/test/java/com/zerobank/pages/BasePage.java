package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    WebDriver driver = Driver.getDriver();

    public BasePage(){
        PageFactory.initElements(driver,this);
    }




}
