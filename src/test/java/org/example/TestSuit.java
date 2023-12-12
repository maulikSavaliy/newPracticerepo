package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{
    PracticePage practicePage=new PracticePage();
    @Test
    public void testbrowser()
    {
        practicePage.clickOnRadioButton();

    }

}
