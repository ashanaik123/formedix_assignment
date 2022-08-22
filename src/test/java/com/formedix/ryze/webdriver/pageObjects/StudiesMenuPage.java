package com.formedix.ryze.webdriver.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudiesMenuPage extends BasePage{

    @FindBy(id = "fdxMdbContainerListItem0MenuToggle")
    WebElement viewMenu;

    //Constructor with Webdriver as parameter
    public StudiesMenuPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Method to click on view menu
    public void clickViewMenu() {
        viewMenu.click();
    }
}