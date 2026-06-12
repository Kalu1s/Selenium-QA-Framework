package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;

    By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectOption(String optionText){
        WebElement element = driver.findElement(dropdown);

        Select select = new Select(element);

        select.selectByVisibleText(optionText);

    }

    public String getSelectedOption(){
        WebElement element = driver.findElement(dropdown);

        Select select = new Select(element);

        return select.getFirstSelectedOption().getText();
    }
}
