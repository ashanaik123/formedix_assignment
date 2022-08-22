package com.formedix.ryze.webdriver.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPropertiesPage extends BasePage{

    @FindBy(id = "assetLocaleEditTextTextareadescription")
    WebElement description;

    @FindBy(id = "saveAsset")
    WebElement validate;

    //Constructor that will be automatically called as soon as the object of the class is created
    public FormPropertiesPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Method to enter username
    public void setDescription(String user) {
        description.clear();
        description.sendKeys(user);
        System.out.println("description " + description.getText());
    }

    public String getDescription() {
        return description.getText();
    }

    //Method to click on Login button
    public void clickValidate() {
        validate.click();
    }
}