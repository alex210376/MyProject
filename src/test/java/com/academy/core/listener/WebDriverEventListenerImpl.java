package com.academy.core.listener;

import com.academy.core.LoginIncorrectTests;
import com.google.common.io.Files;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import java.io.File;
import java.io.IOException;


public class WebDriverEventListenerImpl extends AbstractWebDriverEventListener {

    private final static Logger LOG = LogManager.getLogger(WebDriverEventListenerImpl.class.getName());
    private String screenshotDir;

    public WebDriverEventListenerImpl(String screenshotDir) {
        this.screenshotDir = screenshotDir;
    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        LOG.debug("try navigate to url {}", url);
//        super.beforeNavigateTo(url, driver);
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        LOG.debug("navigated to url {}", url);
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        LOG.debug("try find element by {}", by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        LOG.debug("found element {} by {}", element, by);
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        LOG.debug("try click on element {}", element);
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        LOG.debug("clicked on element {}", element);
    }

    @Override
    public void beforeGetText(WebElement element, WebDriver driver) {
        LOG.debug("try get text from element {}", element);
    }

    @Override
    public void afterGetText(WebElement element, WebDriver driver, String text) {
        LOG.debug("got text from element {}", element);
    }
    @Override
    public void onException(Throwable err, WebDriver driver) {
        LOG.error("Error occurs: {}", err.getMessage());

        makeScreenshot(driver);
    }

    private void makeScreenshot(WebDriver driver) {
        File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenName = "screen_" + System.currentTimeMillis()+".png";
        String screenPath =  screenshotDir+ "/" + screenName;
        File screen = new File(screenPath);
        try {
            Files.copy(tmp, screen);
        } catch (IOException exc) {
            LOG.error("Error copying screenshot from '{}' to '{}'. Details: {}",
                    tmp, screen, exc);
        }
    }


}
