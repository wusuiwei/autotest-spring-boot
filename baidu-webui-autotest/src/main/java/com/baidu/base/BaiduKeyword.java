package com.baidu.base;

import io.github.wusuiwei.selenium.annotation.Keyword;
import io.github.wusuiwei.selenium.base.BaseKeyword;
import io.github.wusuiwei.selenium.utils.WebDriverUtil;

public class BaiduKeyword extends BaseKeyword {
    @Keyword
    public static void openBrowser(String browserType) {
        driver = WebDriverUtil.getDriver();
        driver.manage().window().maximize();
    }
}
