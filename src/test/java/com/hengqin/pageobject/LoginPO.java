package com.hengqin.pageobject;

import com.hengqin.common.OperateElement;
import org.openqa.selenium.WebElement;

public class LoginPO extends BasePage {
    /**
     * 账号元素
     * @return
     */
    private static WebElement getPhoneEle(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".loginPage.phoneEle"));
    }
    /**
     * 密码元素
     * @return
     */
    private static WebElement getPasswordEle(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".loginPage.passwordEle"));
    }

    /**
     * 登录按钮元素
     * @return
     */
    private static WebElement loginButt(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".loginPage.loginButt"));
    }


    /**
     * 登录
     * @param
     */
    public static void login(String channel, String phone, String password){

        getPasswordEle(channel).sendKeys(password);
        getPhoneEle(channel).sendKeys(phone);
        OperateElement.myclick(loginButt(channel));
    }
}
