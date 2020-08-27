package com.hengqin.pageobject;

import com.hengqin.common.OperateElement;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaymentResultPO extends BasePage{
    /**
     * 投保成功元素
     * @return
     */
    private static List<WebElement> getInsuerSuccessEles(String channel){
        return OperateElement.waitElesByXpath(paramProperties.getProperty(""+channel+".payPage.insuerSuccessEles"));
    }

    /**
     * 保单号元素
     * @return
     */
    private static WebElement getPolicyEle(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".payPage.policyEle"));
    }


    /**
     * 判断是否投保成功方法
     * 如果含有投保成功元素且投保单号不为空就返回true，并打印保单号
     * @return
     */
    public static boolean assertIsInsuerSuccess(String channel){
        for (WebElement ele: getInsuerSuccessEles(channel)
             ) {
            if (OperateElement.isElementExsit(ele)){
                if (getPolicyEle(channel).getText().contains("P")){
                    System.out.println(getPolicyEle(channel).getText());
                    return true;
                }
            }
        }
        return false;
    }

}
