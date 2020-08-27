package com.hengqin.pageobject;

import com.hengqin.common.OperateElement;
import org.openqa.selenium.WebElement;

/**
 * 健康告知页面
 */
public class HealthPO extends BasePage{
    /**
     * 以上皆否按钮Ele
     */
    private static WebElement allNoEle(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".healthPage.allNoEle"));
    }

    /**
     * 点击以上皆否按钮
     * 跳转至投保信息录入页面
     */
    public static void clickAllNoEleToInformationWritePage(String channel){
        OperateElement.threadSleep(2000);
        OperateElement.myclick(allNoEle(channel));
    }
}
