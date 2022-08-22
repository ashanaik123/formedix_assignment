package com.formedix.ryze.webdriver.testCases;

import com.formedix.ryze.webdriver.pageObjects.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateDescriptionTest extends BaseTest {

    /**
     * The login test
     */
    @Test
    public void update_desctiption_Test() {

       //Call login utility to application login
        login(new LoginPage(driver));

        //Click on the menu DB
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickMenuMdb();

        //Click on Studios
        RepositoryPage repository = new RepositoryPage(driver);
        repository.clickMenuMdbStudies();

        //Click view on studies page
        StudiesPage studies = new StudiesPage(driver);
        studies.clickViewMenu();

        //Click view
        ViewMenuPage viewMenu = new ViewMenuPage(driver);
        viewMenu.clickView();

        //Click forms
        TechStudyPage techStudyPage = new TechStudyPage(driver);
        techStudyPage.clickForms();

        //Select Medical history
        FormsViewPage formsViewPage = new FormsViewPage(driver);
        formsViewPage.clickMedicalHistory();
        sleep(2);

        //Edit Medical history
        MedicalHistoryPage medicalHistoryPage = new MedicalHistoryPage(driver);
        medicalHistoryPage.clickEditItem();

        //Test data to update the description
        String  actualValue = "Updated by test";
        //Add Description component

        //Update description
        FormPropertiesPage formPropertiesPage = new FormPropertiesPage(driver);
        formPropertiesPage.setDescription(actualValue);
        formPropertiesPage.clickValidate();

        //validate the updated description value
        String expectedValue  = formPropertiesPage.getDescription();

        Assert.assertEquals(expectedValue, actualValue);

        SignoutPage signoutPage = new SignoutPage(driver);
        signout(signoutPage);
    }
}