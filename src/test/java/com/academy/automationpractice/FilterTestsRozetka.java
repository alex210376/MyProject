package com.academy.automationpractice;


import com.academy.core.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.openqa.selenium.*;


public class FilterTestsRozetka extends BaseTest {
    private String baseUrl = "https://rozetka.com.ua/";

    @Test
    public void testSlider() {
        driver.get(baseUrl);
        WebElement menuItem = driver.findElement(By.cssSelector("body > app-root > div > div:nth-child(2) > app-rz-main-page > div > aside > main-page-sidebar > sidebar-fat-menu > div > ul > li:nth-child(1) > a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuItem).perform();
        driver.findElement(By.partialLinkText("Мониторы")).click();

        WebElement leftBtn = driver.findElement(By.cssSelector("/html/body/div[4]/div/div[2]/div[2]/div[1]/div/div/form/div[10]/div/div/div[2]/div[2]/table/tbody/tr/td[1]/div/img"));
        actions.moveToElement (leftBtn)
                .clickAndHold()
                .moveByOffset(15,0)
                .perform();
    }
}
