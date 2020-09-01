package com.baidu.cases;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
public class LoginCase {
    //Configuring A Selenium Hub
    //java -jar selenium-server-standalone-3.141.59.jar -role hub
    //Configuring Nodes For Selenium Grid
    //java -Dwebdriver.chrome.driver="C:\software\chrome-driver\chromedriver-84.0.4147.30.exe" -jar selenium-server-standalone-3.141.59.jar -role node -hub "http://172.20.137.58:4444/grid/register/"

    @Test
    public void baiduTest() {
        RemoteWebDriver driver = null;
        try {

            ChromeOptions chromeOptions = new ChromeOptions();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();

            try {
                driver = new RemoteWebDriver(new URL("http://172.20.137.58:4444/wd/hub"), chromeOptions);
            } catch (MalformedURLException e) {
//                log.error("连接remoteWebdriver出错");
            }
            System.out.println(driver);
            driver.get("http://www.baidu.com");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }
    }
}
