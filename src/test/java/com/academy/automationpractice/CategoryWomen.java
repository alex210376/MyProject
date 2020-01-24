package com.academy.automationpractice;

import com.academy.core.BaseTest;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import org.testng.Assert;

public class CategoryWomen extends BaseTest {

    @Test
    public void testCategoryWomen() {
        driver.get(baseUrl);
        // Клик по пункту 'WOMEN'
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();

        //Получаем заголовок страницы
        String pageTitle = driver.getTitle();
        //Сравниваем первые 5-ть символов с ожидаемым значением "Women"
        Assert.assertEquals(pageTitle.substring(0,5), "Women");

        //Получаем заголовок активного элемента в навигаторе страниц
        String title1 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).getText().trim();
        //Сравниваем полученное название с ожидаемым
        Assert.assertEquals(title1, "WOMEN");

        //Получаем заголовок активного элемента в дереве страниц
        String title2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[1]/h2")).getText().trim();
        //Сравниваем полученное название с ожидаемым
        Assert.assertEquals(title2, "WOMEN");

        //Получаем заголовок открытой страницы
        String title3 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]")).getText().trim();
        //Сравниваем полученное название с ожидаемым
        Assert.assertEquals(title3, "WOMEN");

        //Получаем заголовок баннера
        String title4 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[1]/div/div/span")).getText().trim();
        //Сравниваем полученное название с ожидаемым
        Assert.assertEquals(title4, "Women");

        //Получаем первую строку баннера
        String firstStr = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div/p[1]/strong")).getText().trim();
        //Сравниваем подстроку (с 1-го по 37-ой символы) полученной строки с ожидаемым значением
        Assert.assertEquals(firstStr.substring(0,36), "You will find here all woman fashion");

        //Получаем строку с информацией о количестве продуктов
        String quantityStr = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[2]")).getText().trim();
        //Сравниваем подстроку, в которой удалено количество, с ожидаемым значением
        Assert.assertEquals(quantityStr.replaceAll("[\\d]", ""), "There are  products.");

        //Получаем строку "Women" в пункте "Categories"
        String title5 = driver.findElement(By.xpath("/html/body/div/div[3]/footer/div/section[2]/div/div/ul/li/a")).getText().trim();
        //Сравниваем полученное значение с ожидаемым
        Assert.assertEquals(title5, "Women");
    }

}
