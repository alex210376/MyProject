package com.academy.automationpractice.page;

import com.academy.core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")
    private WebElement signInButton;

    @FindBy(css="#center_column > div.alert.alert-danger > ol > li")
    private WebElement errMsgElement;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Заполняем эл адрес: {0}")
    public LoginPage fillEmail(String login){
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys(login);
        fillInput(emailInput, login);
        return this;
    }

    @Step("Заполняем пароль: {0}")
    public LoginPage fillPassword(String password){
//        passwordInput.click();
//        passwordInput.clear();
//        passwordInput.sendKeys(password);
        fillInput(passwordInput, password);
        return this;
    }

    @Step("Нажимаем ввод")
    public LoginPage clickSubmit() {
        signInButton.click();
        return this;
    }
    public MyAccountPage clickSubmitSuccess() {
        signInButton.click();
        return new MyAccountPage(driver);
    }

    public String getErrMsg() {
        return errMsgElement.getText().trim();
    }

}
