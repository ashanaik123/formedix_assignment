package com.formedix.ryze.webdriver.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicalHistoryPage extends BasePage{

    @FindBy(id = "switchEditMode")
    WebElement editItem;

    //Constructor with Webdriver as parameter
    public MedicalHistoryPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Method to click view from the menu
    public void clickEditItem() {
        editItem.click();

    }
}