package com.academy.selenide.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class HomePage {

    @FindBy(partialLinkText = "Subscribers")
    private SelenideElement subscribersLink;

    public SubscribersPage goToSubscribers() {
        subscribersLink.click();
        return page(SubscribersPage.class);
    }
}
