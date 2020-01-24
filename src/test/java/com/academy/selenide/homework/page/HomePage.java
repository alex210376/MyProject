package com.academy.selenide.homework.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import static com.codeborne.selenide.Selenide.page;

public class HomePage {
    @FindBy(partialLinkText = "Sign in")
    private SelenideElement signIn;

    @Step("Переходим на страницу логирования")
    public LoginPage goToLoginPage() {
        signIn.click();
        return page(LoginPage.class);
    }
}







