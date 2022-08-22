package com.formedix.ryze.webdriver.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public static WebDriver driver;

    public BasePage() {
        System.out.println("base  page driver " + driver);
        PageFactory.initElements(driver, this);
    }
}