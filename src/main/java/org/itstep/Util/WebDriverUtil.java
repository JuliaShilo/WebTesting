package org.itstep.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverUtil {

    public static WebDriver getChromeDriver () {
//        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true);
//        WebDriver

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        return chromeDriver;
    }

}
