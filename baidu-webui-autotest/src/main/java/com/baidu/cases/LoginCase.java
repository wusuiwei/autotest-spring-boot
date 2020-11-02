package com.baidu.cases;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static io.github.wusuiwei.selenium.keywords.ActionKeywords.*;

@Slf4j
public class LoginCase {
    //Configuring A Selenium Hub
    //java -jar selenium-server-standalone-3.141.59.jar -role hub
    //Configuring Nodes For Selenium Grid
    //java -Dwebdriver.chrome.driver=chromedriver-84.0.4147.30.exe -jar selenium-server-standalone-3.141.59.jar -role node -hub "http://172.20.239.87:4444/grid/register/"

    @Test
    public void baiduTest() {
        openBrowser("chrome");
        getUrl("http://www.baidu.com");
        input("id:kw", "济州岛");
        click("id:su");
    }
}
