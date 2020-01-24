package com.academy.automationpractice.page;

import com.academy.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class YourAddressesPage extends BasePage {

    @FindBy(id = "firstname")
    private WebElement firstnameInput;

    @FindBy(id = "lastname")
    private WebElement lastnameInput;

    @FindBy(id = "address1")
    private WebElement addressInput;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "id_state")
    private WebElement stateInput;

    @FindBy(id = "postcode")
    private WebElement postcodeInput;

    @FindBy(id = "phone")
    private WebElement phoneInput;



    public YourAddressesPage(WebDriver driver) {
        super(driver);
    }




    public YourAddressesPage fillfirstname(String firstname){
        fillInput(firstnameInput, firstname);
        return this;
    }

    public YourAddressesPage filllastname(String lastname){
        fillInput(lastnameInput, lastname);
        return this;
    }

    public YourAddressesPage filladdress(String address){
        fillInput(addressInput, address);
        return this;
    }

    public YourAddressesPage fillcity(String city){
        fillInput(cityInput, city);
        return this;
    }

    Select select = new Select(stateInput);
    public YourAddressesPage fillstate(int state){
        select.selectByIndex(state);
        return this;
    }

    public YourAddressesPage fillpostcode(String postcode){
        fillInput(postcodeInput, postcode);
        return this;
    }

    public YourAddressesPage fillphone(String phone){
        fillInput(phoneInput, phone);
        return this;
    }





}
