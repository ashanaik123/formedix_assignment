package com.formedix.ryze.webdriver.testCases;

import com.formedix.ryze.webdriver.pageObjects.DashboardPage;
import com.formedix.ryze.webdriver.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void successful_login() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName(USER_NAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLogin();

        DashboardPage dashboardPage = new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.isDisplayed());
    }
    @Test
    public void unsuccessful_login() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName("steph");
        loginPage.setPassword(PASSWORD);
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.isLoginError());
    }
}
