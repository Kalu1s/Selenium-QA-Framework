package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {
    WebDriver driver;

    By checkbox1 = By.xpath("(//input[@type='checkbox'])[1]");
    By checkbox2 = By.xpath("(//input[@type='checkbox'])[2]");

    public CheckboxPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectCheckBox1(){
        if(!driver.findElement(checkbox1).isSelected()){
            driver.findElement(checkbox1).click();
        }
    }

    public void unselectCheckbox1(){
        if(driver.findElement(checkbox1).isSelected()){
            driver.findElement(checkbox1).click();
        }
    }

    public boolean isCheckbox1Selected() {

        return driver.findElement(checkbox1).isSelected();

    }
    public boolean isCheckbox2Selected() {

        return driver.findElement(checkbox2).isSelected();
    }
}
