/**
 * This is the base class for all test cases.
 */
package com.formedix.ryze.webdriver.testCases;

import com.formedix.ryze.webdriver.pageObjects.LoginPage;
import com.formedix.ryze.webdriver.pageObjects.SignoutPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public abstract class BaseTest {

    public static final String BASE_URL = "https://ryze-staging.formedix.com/sign-in";

    public static final String USER_NAME = "testteamtechtest";

    public static final String PASSWORD = "T3st3rT3ch";

    protected WebDriver driver;

    public BaseTest() {
        super();
    }

    @BeforeTest
    public void beforeTest() {
        //Download the web driver executable
        WebDriverManager.chromedriver().setup();
        //Create an instance of your web driver - chrome
        driver = new ChromeDriver();
        //Maximise the window
        driver.manage().window().maximize();

        //Load login page
        driver.get(BASE_URL);

        //implicit wait for the page to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void afterTest() {
        //	driver.quit();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //The utility method to perform login.
    public void login(LoginPage loginPage) {

        //Enter userName
        loginPage.setUserName(USER_NAME);

        //Enter password
        loginPage.setPassword(PASSWORD);

        //Click login button
        loginPage.clickLogin();


    }
    public void signout(SignoutPage signoutPage){
        signoutPage.clickMenUser();
        signoutPage.clickMenUserLogout();
    }
}