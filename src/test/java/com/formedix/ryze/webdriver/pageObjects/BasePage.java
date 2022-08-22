package com.formedix.ryze.webdriver.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * THis is base page object. Add all generic page related implementation like header, footer.
 */
public abstract class BasePage {

    public static WebDriver driver;

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}