package com.hengqin.pageobject;

import com.hengqin.common.OperateElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ProductListPO extends BasePage{
    /**
     * 搜索框
     */
    private static WebElement searchInput(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".productList.searchInput"));
    }

    /**
     * 搜索操作
     * @param productName 产品名
     */
    public static void searchProduct(String productName,String channel){
        searchInput(channel).clear();
        searchInput(channel).sendKeys(productName);
        searchInput(channel).sendKeys(Keys.ENTER);
    }

    /**
     * 搜索出来的产品结果的产品名Ele
     * @param channel 渠道
     * @return
     */
    private static WebElement productNameWithSearch(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".productList.productName"));
    }

    /**
     * 搜索并点击搜索出的产品进入该产品详情页
     * @param productName
     */
    public static void searchProductNameToProductDetailPage(String productName,String channel){
        searchProduct(productName,channel);
        OperateElement.myclick(productNameWithSearch(channel));
    }


    /**
     * 进入产品详情页（官微）
     * @param productName
     */
    public static void toProductDetailPage(String productName,String channel){
        OperateElement.scrollIntoView(OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productName+".productName")));
        OperateElement.myclick(OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productName+".productName")));
    }

}
