package com.academy.automationpractice.page;

import com.academy.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAddressesPage extends BasePage {

    @FindBy(css = "#center_column > div > a > span")
    private WebElement AddNewAddressButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div[1]/div/div[1]/ul/li[9]/a[2]/span")
    private WebElement deleteButton;

    public MyAddressesPage(WebDriver driver) {
        super(driver);
    }
    public YourAddressesPage clickAddNewAddress() {
        AddNewAddressButton.click();
        return new YourAddressesPage(driver);
    }

    public boolean IsElementExists(String elementName)
    {
        try {
            driver.findElement(By.className(elementName));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public MyAddressesPage delete(){
        deleteButton.click();
        return this;
    }

}
