package com.baidu.cases;

import io.github.wusuiwei.selenium.SeleniumBaseTests;
import org.junit.jupiter.api.Test;


public class LoginTest extends SeleniumBaseTests {
    @Test
    public void loginSuccessTest() throws InterruptedException {
        driver.get("http://www.baidu.com");
        Thread.sleep(20000);
    }
}
