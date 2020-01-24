package com.academy.core;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginIncorrectTests extends BaseTest{
    private final static Logger LOG = LogManager.getLogger(LoginIncorrectTests.class.getName());

    @Test(dataProvider = "incorrectAuthDataProvider")
    public void testIncorrectLogin(String login, String password, String message) {
        LOG.info("start testIncorrectLogin");
        driver.get(baseUrl);
        System.out.println(baseUrl);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(login);
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();
        String str = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText().trim();
        System.out.println(str);
        Assert.assertEquals(str, message);
        LOG.info("finished testIncorrectLogin");
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
        LOG.debug("*****List*****");
        LOG.debug(data);

        Object[][] result = new Object[data.size()][3];
        for (int i=0; i<data.size(); i++){
            result[i]=data.get(i).split(",");
        }
        LOG.debug("*****Array*****");
        LOG.debug(Arrays.deepToString(result));
        return result;
    }

//        int i=0;
//        Object[][] line = ;
//        while((nextLine = br.readLine())!=null) {
//            String[] arr = nextLine.split(",");
//            line = new Object[i][3];
//            line[i][0] = arr[0];
//            line[i][1] = arr[1];
//            line[i][2] = arr[2];
//            i++;
//        }
//



//        return new Object[][]{
//                {"user1@gmail.com", "user1", "Authentication failed."},
//                {"user1@gmail.com", "Lamborgini21", "Authentication failed."},
//                {"stovbenko@gmail.com", "1234567", "Authentication failed."},
//                {"", "", "An email address required."},
//                {"", "1234567", "An email address required."},
//                {"user1@gmail.com", "", "Password is required."},
//                {"1234567", "Lamborgini21", "Invalid email address."},
//        };

}
