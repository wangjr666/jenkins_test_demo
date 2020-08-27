package com.hengqin.cases;

import com.hengqin.common.BaseTest;
import com.hengqin.common.InitDriver;
import com.hengqin.common.OperateElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTest extends BaseTest {
    @Parameters("browser")
    @Test
    void fun(String browser){
        driver = InitDriver.launchChromeDriver(browser);
        OperateElement.driver = driver;
        driver.get("http://www.baidu.com");
    }
}
