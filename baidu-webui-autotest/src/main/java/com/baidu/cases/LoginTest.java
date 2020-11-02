package com.baidu.cases;

import io.github.wusuiwei.selenium.base.BaseTest;
import org.junit.jupiter.api.Test;


public class LoginTest extends BaseTest {
    @Test
    public void loginSuccessTest() throws InterruptedException {
        driver.get("http://www.baidu.com");
        Thread.sleep(20000);
    }
}
