package com.academy.automationpractice;

import com.academy.automationpractice.allure.TestListener;
import com.academy.core.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;

@Listeners(TestListener.class)
public class IncorrectLoginTests extends BaseTest {

    @Description("Тестируем попытки неуспешной аутентификации")
    @Test(dataProvider = "incorrectAuthDataProvider")
    public void testIncorrectLogin(String login, String password, String message) {
        driver.get(baseUrl);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(login);
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
        String str = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText().trim();
        System.out.println(str);
        Assert.assertEquals(str, message);
        //driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();
    }

    @DataProvider(name = "incorrectAuthDataProvider")
    public Object[][] incorrectAuthDataProvider (){
        return new Object[][]{
                {"user1@gmail.com", "user1", "tets_test_test"},
//                {"user1@gmail.com", "user1", "Authentication failed."},
                {"user1@gmail.com", "Lamborgini21", "Authentication failed."},
                {"stovbenko@gmail.com", "1234567", "Authentication failed."},
                {"", "", "An email address required."},
                {"", "1234567", "An email address required."},
                {"user1@gmail.com", "", "Password is required."},
                {"1234567", "Lamborgini21", "Invalid email address."},
        };


    }
}


