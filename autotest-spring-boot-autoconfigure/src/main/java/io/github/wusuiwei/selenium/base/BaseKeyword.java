package io.github.wusuiwei.selenium.base;

import io.github.wusuiwei.selenium.annotation.Keywords;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

@Keywords
public class BaseKeyword {
    @Autowired
    public static WebDriver driver;

}
