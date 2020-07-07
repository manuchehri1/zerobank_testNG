package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy (id = "signin_button")
    public WebElement signInBtn;

    @FindBy (id = "user_login")
    public WebElement username;

    @FindBy (id = "user_password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement loginBtn;

    @FindBy (xpath = "//div[contains(text(),'are wrong')]")
    public WebElement errorMessage;

    public  void login(String username, String password){
        signInBtn.click();
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginBtn.click();
        System.out.println("You have login successfully");
    }

    public  void login(){
        signInBtn.click();
        this.username.sendKeys(ConfigurationReader.getProperty("username"));
        this.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginBtn.click();
        System.out.println("You have login successfully");
    }


}
