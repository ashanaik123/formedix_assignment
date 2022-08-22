package com.formedix.ryze.webdriver.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id = "username")
    WebElement userName;

    @FindBy(id = "menuMdb")
    WebElement menuMdb;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "btnSubmit")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"signInFormFeedback\"]/div[2]")
    WebElement signinError;

    //Constructor that will be automatically called as soon as the object of the class is created
    public LoginPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Method to enter username
    public void setUserName(String user) {
        userName.sendKeys(user);
    }

    //Method to enter password
    public void setPassword(String pass) {
        password.sendKeys(pass);
    }

    //Method to click on Login button
    public void clickLogin() {
        loginBtn.click();
    }
    public boolean isLoginError(){
        return signinError.isDisplayed();
    }
}