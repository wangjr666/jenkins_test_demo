package com.hengqin.pageobject;

import com.hengqin.common.OperateElement;
import org.openqa.selenium.WebElement;

public class ProductDetailPO extends BasePage {
    /**
     * 立即投保按钮
     */
    private static WebElement getDoInsureNowButtonEle(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".productDetail.doInsureNowButt"));
    }

    /**
     * 点击立即投保按钮
     * 调出试算页面
     */
    public static void clikeDoInsureNowButtToTrinalPage(String channel){
        OperateElement.threadSleep(2000);
        OperateElement.myclick(getDoInsureNowButtonEle(channel));
    }
}
