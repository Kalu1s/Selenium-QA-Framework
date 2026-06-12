package org.example.tests;

import org.example.base.BaseTest;
import org.example.pages.DropdownPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    @Test
    public void selectOption1Test(){
        driver.get("https://the-internet.herokuapp.com/dropdown");

        DropdownPage page = new DropdownPage(driver);

        page.selectOption("Option 1");

        Assert.assertEquals(page.getSelectedOption(),"Option 1");
    }

    @Test
    public void selectOption2Test() {

        driver.get("https://the-internet.herokuapp.com/dropdown");

        DropdownPage page = new DropdownPage(driver);

        page.selectOption("Option 2");

        Assert.assertEquals(page.getSelectedOption(),"Option 2");
    }
}
