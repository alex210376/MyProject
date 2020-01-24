package com.academy.automationpractice.page;

import com.academy.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(css = "#center_column > div > div:nth-child(1) > ul > li:nth-child(4) > a > span")
    private WebElement myAddressesButton;

    @FindBy(css = "div.header..........")
    private WebElement userName;

    @FindBy(css = "a.logout")
    private WebElement logOut;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public MyAddressesPage clickMyAddresses() {
        myAddressesButton.click();
        return new MyAddressesPage(driver);
    }


}
