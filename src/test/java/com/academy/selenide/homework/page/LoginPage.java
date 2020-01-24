package com.academy.selenide.homework.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    @FindBy(css="#email")
    private SelenideElement emailInput;

    @FindBy(css = "#passwd")
    private SelenideElement passwordInput;

    @FindBy(css = "#SubmitLogin > span")
    private SelenideElement signInButton;

    @FindBy(css="#center_column > div.alert.alert-danger > ol > li")
    private SelenideElement errMsgElement;

    @Step("Вводим электронный адрес: {0}")
    public LoginPage fillEmail(String login){
        emailInput.click();
        emailInput.clear();
        emailInput.setValue(login);
        return page(LoginPage.class);
    }

    @Step("Вводим пароль: {0}")
    public LoginPage fillPassword(String password){
        passwordInput.click();
        passwordInput.clear();
        passwordInput.setValue(password);
        return page(LoginPage.class);
    }

    @Step("Подтверждаем ввод")
    public LoginPage clickSubmit() {
        signInButton.click();
        return page(LoginPage.class);
    }

    public String getErrMsg() {
        return errMsgElement.getText().trim();
    }

}
