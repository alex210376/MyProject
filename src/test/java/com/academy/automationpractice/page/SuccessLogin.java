package com.academy.automationpractice.page;

import com.academy.core.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessLogin extends BaseTest {

    @Test
    public void testSuccessLogin() throws InterruptedException {
         new HomePage(driver, baseUrl)
                .goToHome()
                .clickSignIn()
                .fillEmail("stovbenko@gmail.com")
                .fillPassword("Lamborgini21")
                .clickSubmitSuccess()
                .clickMyAddresses();
         MyAddressesPage page = new MyAddressesPage(driver);

         if(page.IsElementExists("bloc_adresses row")){
             page.delete();
         }
             else {
             new MyAddressesPage(driver).clickAddNewAddress();
         }

        new YourAddressesPage(driver)
//                .clickAddNewAddress()
                .fillfirstname("Oleksandr")
                .filllastname("Stovbenko")
                .filladdress("Prospekt Oleksandrivskiy")
                .fillcity("Kharkiv")
                .fillstate(18)
                .fillpostcode("61000")
                .fillphone("0505555555");


//        String address = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/div/div/ul/li[1]/h3")).getText().trim();
//        System.out.println(address);
//        //Сравниваем полученное название с ожидаемым
//        Assert.assertEquals(address, "KHARKIV");
        Thread.sleep(10000);
    }
}
