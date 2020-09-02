package io.github.wusuiwei.selenium;

import io.github.wusuiwei.base.Keyword;
import io.github.wusuiwei.base.Keywords;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

@Keywords
public class SeleniumActionKeywords {
    public static WebDriver driver;

    public static SeleniumProterties seleniumProterties;

    @Autowired
    public SeleniumActionKeywords(SeleniumProterties seleniumProterties) {
        SeleniumActionKeywords.seleniumProterties = seleniumProterties;
    }

    @Keyword
    public static void openBrowser(String browserName) {
        System.setProperty("webdriver.chrome.driver", "D:\\code\\github\\autotest-spring-boot\\baidu-webui-autotest\\src\\main\\resources\\chromedriver.exe");
        System.out.println(seleniumProterties.getDriver().getChrome().getPlatformName());
        driver = new ChromeDriver();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

}
