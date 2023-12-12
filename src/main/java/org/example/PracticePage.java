package org.example;

import org.openqa.selenium.By;

public class PracticePage extends Utils
{
    public void clickOnRadioButton()
    {
        clickOnElement(By.xpath("//div[@class=\"block large-row-spacer\"]/div/fieldset/label[1]//input[@value=\"radio1\"]"));

        enterValueInElement(By.cssSelector("input#autocomplete"),"my name is maulik");

    }

}
