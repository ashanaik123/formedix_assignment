package com.formedix.ryze.webdriver.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignoutPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"menuUser\"]/fdx-main-nav-item/div/p[2]")
    WebElement menUser;

    @FindBy(xpath ="//*[@id=\"menuUserLogout\"]/span/p")
    WebElement menUserLogout;

    //Constructor with Webdriver as parameter
    public SignoutPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Method to click
    public void clickMenUser() {
        menUser.click();
    }

    //Method to click
    public void clickMenUserLogout() {
        menUserLogout.click();
    }
}


