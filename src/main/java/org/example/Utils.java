package org.example;

import org.openqa.selenium.By;

public class Utils extends BasePage
{
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    public void enterValueInElement(By by,String input)
    {
        driver.findElement(by).sendKeys(input);

    }

}
