package com.academy.automationpractice.page;

import com.academy.core.AssertWithLogging;
import com.academy.core.BaseTest;
import com.academy.core.LoginIncorrectTests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginTestsPage extends BaseTest {
    private final static Logger LOG = LogManager.getLogger(LoginIncorrectTests.class.getName());

    @Test(dataProvider = "incorrectAuthDataProvider")
    public void testIncorrectLogin(String login, String password, String expectedErrMsg) {
//        LOG.info("start LoginTestsPage");
//1-ый способ длинный
//        HomePage homePage = new HomePage(driver, baseUrl);
//        homePage = homePage.goToHome();
//        LoginPage loginPage = homePage.clickSignIn();
//        loginPage = loginPage.fillEmail(login);
//        loginPage = loginPage.fillPassword(password);
//        loginPage = loginPage.clickSubmit();
//        String actualErrMsg = loginPage.getErrMsg();

//        Assert.assertEquals(actualErrMsg, expectedErrMsg);

//2-ой способ короткий
        LoginPage loginPage = new HomePage(driver, baseUrl)
                .goToHome()
                .clickSignIn()
                .fillEmail(login)
                .fillPassword(password)
                .clickSubmit();

        String actualErrMsg = loginPage.getErrMsg();
        Assert.assertEquals(actualErrMsg, expectedErrMsg);

        AssertWithLogging.assertEquals(actualErrMsg, expectedErrMsg);
//        LOG.info("finished LoginTestsPage");

//        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
//        String str = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText().trim();
//        System.out.println(str);
//        Assert.assertEquals(str, message);
//        //driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();
    }


    @DataProvider(name = "incorrectAuthDataProvider")
    public Object[] incorrectAuthDataProvider () throws IOException {
        String file = properties.getProperty("data.dir") + "/automationpractice-auth-data.csv";
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<String> data = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            if(!line.trim().startsWith("#"))
                data.add(line);
        }

        br.close();

        //TODO LOG
//        LOG.debug("*****List*****");
//        LOG.debug(data);

        Object[][] result = new Object[data.size()][3];
        for (int i=0; i<data.size(); i++){
            result[i]=data.get(i).split(",");
        }
//        LOG.debug("*****Array*****");
//        LOG.debug(Arrays.deepToString(result));
        return result;
    }
//    @DataProvider(name = "incorrectAuthDataProvider")
//    public Object[][] incorrectAuthDataProvider (){
//        return new Object[][]{
//                {"user1@gmail.com", "user1", "Authentication failed."},
//                {"user1@gmail.com", "Lamborgini21", "Authentication failed."},
//                {"stovbenko@gmail.com", "1234567", "Authentication failed."},
//                {"", "", "An email address required."},
//                {"", "1234567", "An email address required."},
//                {"user1@gmail.com", "", "Password is required."},
//                {"1234567", "Lamborgini21", "Invalid email address."},
//        };
//
//
//    }
}
