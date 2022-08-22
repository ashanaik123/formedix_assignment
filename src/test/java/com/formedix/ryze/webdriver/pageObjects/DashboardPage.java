package com.formedix.ryze.webdriver.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"menuMdb\"]/fdx-main-nav-item/div")
    WebElement menuMdb;

    //Constructor that will be automatically called as soon as the object of the class is created
    public DashboardPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Method to click on menuMDb
    public boolean isDisplayed() {
        return menuMdb.isDisplayed();
    }
    //Method to click on menuMDb
    public void clickMenuMdb() {
        menuMdb.click();
    }
}


