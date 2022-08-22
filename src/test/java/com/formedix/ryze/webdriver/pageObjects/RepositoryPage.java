package com.formedix.ryze.webdriver.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepositoryPage extends BasePage {

    @FindBy(id = "menuMdbStudies")
    WebElement menuMdbStudies;

    //Constructor with Webdriver as parameter
    public RepositoryPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Method to click on menuMDb
    public void clickMenuMdbStudies() {
        menuMdbStudies.click();
    }
}


