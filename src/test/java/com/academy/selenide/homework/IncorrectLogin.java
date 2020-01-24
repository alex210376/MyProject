package com.academy.selenide.homework;


import com.academy.selenide.homework.page.LoginPage;
import com.academy.selenide.homework.page.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class IncorrectLogin {

    protected Properties properties;

    @BeforeClass
    public void setUp() throws IOException {
        properties = new Properties();
        properties.load(this.getClass().getClassLoader().getResourceAsStream("common.properties"));
        baseUrl = properties.getProperty("baseUrl");
        timeout = 10;
        browser = "chrome";
        startMaximized = true;
    }


    @Test(dataProvider = "incorrectAuthDataProvider")
    public void testIncorrectLogin(String login, String password, String expectedErrMsg) {

        LoginPage loginPage = open(baseUrl, HomePage.class)
                .goToLoginPage()
                .fillEmail(login)
                .fillPassword(password)
                .clickSubmit();

        String actualErrMsg = loginPage.getErrMsg();
        Assert.assertEquals(actualErrMsg, expectedErrMsg);

    }


    @AfterClass
    public void tearDown() {
        closeWebDriver();
    }

    @DataProvider(name = "incorrectAuthDataProvider")
    public Object[][] incorrectAuthDataProvider() {
        return new Object[][]{
                {"user1@gmail.com", "user1", "Authentication failed."},
                {"user1@gmail.com", "Lamborgini21", "Authentication failed."},
                {"stovbenko@gmail.com", "1234567", "Authentication failed."},
                {"", "", "An email address required."},
                {"", "1234567", "An email address required."},
                {"user1@gmail.com", "", "Password is required."},
                {"1234567", "Lamborgini21", "Invalid email address."},
        };
    }
}