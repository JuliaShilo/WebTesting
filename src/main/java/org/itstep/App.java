package org.itstep;

import org.itstep.Util.TimerUtil;
import org.itstep.Util.WebDriverUtil;
import org.itstep.model.User;
import org.itstep.service.DataExtraction;
import org.itstep.service.PromDataExtraction;
import org.itstep.service.PromUserBotService;
import org.openqa.selenium.WebDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


//        String url = "https://prom.ua/ua/p843085994-noutbuk-omen-dc0047ur.html";
//        DataExtraction promExtraction = new PromDataExtraction();
//        System.out.println( promExtraction.getItemFromProductUrl(url).getName());

        WebDriver driver = WebDriverUtil.getChromeDriver();
        TimerUtil.waitSeconds(3);

        User user = new User("Julia Shilo", "Liplip.email.12345@gmail.com", "qwerty123456");

        PromUserBotService.registerPromUser(user, driver);

//        driver.get("https://www.amazon.com");
//
//        TimerUtil.waitSeconds(10);

        TimerUtil.waitSeconds(10);
        driver.quit();
    }
}
