package com.academy.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MixedTests {
    private WebDriver driver;
    private String baseUrl;

    @BeforeClass(alwaysRun = true)
    public void testSearchAndSort () throws IOException {
        Properties properties = new Properties();
        properties.load(this.getClass().getClassLoader().getResourceAsStream("common.properties"));
        System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.driver"));
        driver = new ChromeDriver();
        baseUrl = properties. getProperty("baseUrl");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void testSerch() throws InterruptedException {
       // Попасть на главную страницу
        driver.get(baseUrl);
        WebElement searchField = driver.findElement(By.id("search_query_top"));
        searchField.click();
        searchField.clear();
        searchField.sendKeys("Dress");
        driver.findElement(By.name("submit_search")).click();

        driver.findElement(By.cssSelector("#list > a")).click();
        new WebDriverWait(driver, 5000)
                .until(ExpectedConditions.attributeToBe(
                        By.id("list"), "class", "selected"
                ));

        //Сортировка
        Select select = new Select(driver.findElement(By.id("selectProductSort")));
        select.selectByValue("name:desc");



        //Thread.sleep(3000);
        // Проверки
        WebElement titleElement = driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div > div > h5 > a"));
        String titleText = titleElement.getText().trim();
        WebElement priceElement = driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div > div.right-block > div > div > span.price.product-price"));
        String priceText = priceElement.getText().trim();

        Assert.assertEquals(titleText, "Printed Summer Dress");
        Assert.assertEquals(priceText, "$28.98");



    }




    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }


}

