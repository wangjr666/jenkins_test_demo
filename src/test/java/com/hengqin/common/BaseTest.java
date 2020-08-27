package com.hengqin.common;

import com.hengqin.pageobject.BasePage;
import com.hengqin.utils.ReadProperties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.Properties;

/**
 * Author: 灵枢
 * Date: 2019/3/28
 * Time: 17:11
 * Description:
 */

@Listeners({TestngListener.class})
public class BaseTest {
    public ChromeDriver driver;
    public Properties envProperties;
    public Properties paramProperties;

    public ChromeDriver getDriver(){
        return driver;
    }

    @BeforeTest(description = "初始化driver，读取配置文件")
    public void setUp(){
        //读取配置文件
        envProperties = ReadProperties.readProperties("env.properties");
        paramProperties = ReadProperties.readProperties("param.properties");
        BasePage.paramProperties = paramProperties;
    }

    @AfterTest(description = "浏览器关闭")
    public void tearDown() {
         driver.quit();
    }

}
