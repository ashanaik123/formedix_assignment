package com.formedix.ryze.webdriver.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormsViewPage extends BasePage{
    private static String MEDICAL_HISTORY = "Medical History";

    @FindBy(className = "fdx-ellipsis")
    List<WebElement> medicalHistory;


    //Constructor that will be automatically called as soon as the object of the class is created
    public FormsViewPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Method to click view from the menu
    public void clickMedicalHistory() {
        for (int i = 0; i < medicalHistory.size(); i++) {
            WebElement option = medicalHistory.get(i);
            if (option.getText().equalsIgnoreCase(MEDICAL_HISTORY)) {
                option.click();
                break;
            }

        }
    }
}