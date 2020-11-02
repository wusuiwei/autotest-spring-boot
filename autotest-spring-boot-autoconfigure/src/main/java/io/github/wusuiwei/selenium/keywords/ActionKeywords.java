package io.github.wusuiwei.selenium.keywords;

import io.github.wusuiwei.selenium.annotation.Keyword;
import io.github.wusuiwei.selenium.annotation.Keywords;
import io.github.wusuiwei.selenium.config.SeleniumProterties;
import io.github.wusuiwei.selenium.utils.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

@Keywords
public class ActionKeywords {
    @Autowired
    public static WebDriver driver;

    public static SeleniumProterties seleniumProterties;

    @Autowired
    public ActionKeywords(SeleniumProterties seleniumProterties) {
        ActionKeywords.seleniumProterties = seleniumProterties;
    }

    @Keyword
    public static void openBrowser(String browserType) {
        driver = WebDriverUtil.getDriver();
        driver.manage().window().maximize();
    }

    @Keyword
    public static void getUrl(String url) {
        driver.get(url);
    }
    @Keyword
    public static void click(String path) {
        WebElement element = getElement(path);
        element.click();
    }
    @Keyword
    public static void input(String path,String words) {
        WebElement element = getElement(path);
        element.sendKeys(words);
    }

    private static WebElement getElement(String path) {
        return driver.findElement(By.xpath(path));
    }
}
