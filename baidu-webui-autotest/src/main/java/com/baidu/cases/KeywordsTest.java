package com.baidu.cases;

import io.github.wusuiwei.selenium.SeleniumActionKeywords;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class KeywordsTest {
    @Test
    void test() {
        SeleniumActionKeywords.openBrowser("chrome");
    }
}
