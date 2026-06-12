package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    WebDriver driver;

    By flashmsg  = By.id("flash");

    public SecurePage(WebDriver driver){
        this.driver = driver;
    }

    public String getMessage(){
        return driver.findElement(flashmsg).getText();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
