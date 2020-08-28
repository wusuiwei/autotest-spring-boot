package io.github.wusuiwei.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private String menu;
    private String iframe;
    private String host = "http://10.15.2.10:25754/views/index.html";

    @FindBy(css = "body > div.app-wrapper > div.sidebar-container > ul")
    private WebElement menuList;

    public BasePage(WebDriver driver, String menu, String url) {
        this.menu = menu;
        this.iframe = url;
        driver.get(host);
        PageFactory.initElements(driver,this);
        //切换菜单
        String[] menuSteps = menu.split("-");
        WebElement clickMenu= menuList;
        for (String menuStep : menuSteps) {
            if (menuStep.equals("工单管理")) {
                continue;
            }else {
                clickMenu = clickMenu.findElement(By.xpath("//*[text()='" + menuStep + "']"));
                clickMenu.click();
            }
        }
        //切换到具体的标签页
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'"+url+"')]")));
    }
}
