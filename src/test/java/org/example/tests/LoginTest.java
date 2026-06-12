package org.example.tests;

import org.example.base.BaseTest;
import org.example.pages.LoginPage;
import org.example.pages.SecurePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        driver.get("https://the-internet.herokuapp.com/login");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("tomsmith","SuperSecretPassword!");

        wait.until(ExpectedConditions.urlContains("/secure"));

        SecurePage securePage = new SecurePage(driver);

        Assert.assertTrue(securePage.getCurrentUrl().contains("/secure"),
                "URL didn't change to secure page"
        );

        Assert.assertTrue(securePage.getMessage().contains("You logged into a secure area!"),
                "Success message not displayed"
        );
    }

    @Test
    public void invalidLoginTest() {

        driver.get("https://the-internet.herokuapp.com/login");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("wrong", "wrong"
        );

        SecurePage securePage = new SecurePage(driver);

        Assert.assertTrue(securePage.getMessage().contains("Your username is invalid!"),
                "Error message not displayed"
        );
    }
}