package com.hengqin.pageobject;


import com.hengqin.Enum.ChannelEnum;
import com.hengqin.common.OperateElement;
import org.openqa.selenium.WebElement;

/**
 * Author: wang
 * Date: 2020/7/6
 * Description: 微店首页元素封装
 */
public class ShouyePO extends BasePage{
    /**
     * 产品按钮
     */

    private static WebElement productButt(String channel){
        if (channel.equals(ChannelEnum.WEIDIAN)){
            return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".shouye.productButt"));
        }
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".shouye.productButt"));
    }

    /**
     * 点击产品按钮
     * 跳转至产品列表页
     */
    public static ProductListPO clickProductButtToProductList(String channel){
        OperateElement.threadSleep(1000);
        OperateElement.myclick(productButt(channel));
        return new ProductListPO();
    }

}
