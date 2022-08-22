package com.formedix.ryze.webdriver.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewMenuPage extends BasePage{

    @FindBy(id = "fdxMdbContainerListItem0View")
    WebElement view;

    //Constructor with Webdriver as parameter
    public ViewMenuPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Method to click view from the menu
    public void clickView() {
        view.click();
    }
}