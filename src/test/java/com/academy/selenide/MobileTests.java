package com.academy.selenide;

import com.academy.selenide.page.HomePage;
import com.academy.selenide.page.SubscribersPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class MobileTests {

    @BeforeClass
    public void setUp(){
        baseUrl = "localhost:8081";
        timeout = 3;
//        Configuration.browser = "com.academy.selenide.configuration.GeckoDriverProvider"
        browser = "chrome";
        startMaximized = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );
    }

    @Description ("Проверка ввода нового абонента")
    @Test
    public void testCreateSubscriber() {
        open(baseUrl);
        $(byPartialLinkText("Subscribers")).click();
        //        WebDriver driver = WebDriverRunner.getWebDriver();
//        List<WebElement> elements = driver.findElements(By.xpath("//td[4]"));
//        List<String> lastNames_ = new ArrayList<>();
//        for (WebElement item : elements) {
//            lastNames_.add(item.getText());
//        }
        List<String> lastNamesBefore = $$(byXpath("//td[4]")).texts();
        System.out.println(lastNamesBefore);

//        $(byId("add")).click();
//        $(byName("firstName")).setValue("Ivan");
//        $(byName("lastName")).setValue("Drago2");
//        $(byName("age")).setValue("55");
//        $(byCssSelector(".btn.btn-success")).click();

        $(byId("add")).click();
        $(byId("fname")).sendKeys("FirstName");
        $(byId("lname")).sendKeys("LastName");
        $(byId("FEMALE")).click();
        $(byId("age")).clear();
        $(byId("age")).sendKeys("18");
        $(byCssSelector(".btn.btn-success")).click();

        List<String> lastNamesAfter = $$(byXpath("//td[4]")).texts();
        Assert.assertEquals(lastNamesBefore.size() + 1, lastNamesAfter.size());

        lastNamesBefore.add("LastName");
        Collections.sort(lastNamesBefore);
        Collections.sort(lastNamesAfter);
        Assert.assertEquals(lastNamesBefore, lastNamesAfter);

        sleep(3000);
    }
    @Description ("Проверка ввода нового абонента реализованная на PageObject")
    @Test
    public void testCreateSubscriberPageObject() {
            SubscribersPage subscribersPage = open(baseUrl, HomePage.class)
                    .goToSubscribers()
                    .clickAdd()
                    .fillFirstName("Ashot")
                    .fillLastName("Gurenovich")
                    .setAsFemale()
                    .fillAge(50)
                    .submit();

            List<String> lastNames = subscribersPage.getLastNames();
            System.out.println(lastNames);
//            Assert.fail();
    }


    @AfterClass
    public void tearDown(){
        closeWebDriver();
    }
}
