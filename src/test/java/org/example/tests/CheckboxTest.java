package org.example.tests;

import org.example.base.BaseTest;
import org.example.pages.CheckboxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {

    @Test
    public void checkboxSelectionTest(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        CheckboxPage page = new CheckboxPage(driver);

        page.selectCheckBox1();

        Assert.assertTrue(page.isCheckbox1Selected(),"CheckBox 1 is not selected");
    }

    @Test
    public void checkboxDefaultStateTest() {

        driver.get(
                "https://the-internet.herokuapp.com/checkboxes"
        );

        CheckboxPage page =
                new CheckboxPage(driver);

        Assert.assertTrue(
                page.isCheckbox2Selected(),
                "Checkbox 2 should be selected by default"
        );
    }
}
