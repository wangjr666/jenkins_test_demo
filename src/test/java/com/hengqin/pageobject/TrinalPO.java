package com.hengqin.pageobject;

import com.hengqin.common.OperateElement;
import org.openqa.selenium.WebElement;

public class TrinalPO extends BasePage{


    /**
     * 被保人出生日期Ele
     */
    public static WebElement getInsuredBirthDateEle(){
        return OperateElement.waitByXpath(paramProperties.getProperty("weidian.youkangbao.insurediBirthDateEle"));
    }

    /**
     * 被保人出生日期Ele（筛选）
     */
    public static WebElement insuredBirthDateEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insurediBirthDateEle"));
    }

    /**
     * 改变出生日期的值
     * @param Date
     */
    public static void changeInsuredBirthDate(String Date){
        getInsuredBirthDateEle();
        String newJsStr = "document.getElementsByClassName(\"vux-cell-value\")[0].innerHTML='"+Date+"'";
        OperateElement.executeJs(newJsStr);
    }

    public static WebElement getInsuredBirthDateEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insurediBirthDateEle"));
    }
    /**
     * 被保人出生日期View的完成按钮Ele
     */
    private static WebElement getInsuredBirthDateViewSuccessBtuuEle(String channel, String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insurediBirthDateViewSuccessButtEle"));
    }


    /**
     * 选择出生日期的默认值
     */
    public static void chooseDefultInsuredBirthDate(String channel,String productFlag){
        OperateElement.myclick(getInsuredBirthDateEle(channel,productFlag));
        OperateElement.myclick(getInsuredBirthDateViewSuccessBtuuEle(channel,productFlag));
    }




    /**
     * 获取保额输入input框Ele
     * @return
     */
    private static WebElement getOverageInputEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".overageInputEle"));
    }

    /**
     * 获取立即投保按钮Ele
     * @return
     */
    private static WebElement getDoInsureNowButt(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".doInsureNowButton"));
    }



    /**
     * 往保额的input框输入保额
     * @param overageNum
     */
    public static void insertOverage(int overageNum,String channel,String productFlag){
        String s = String.valueOf(overageNum);
        getOverageInputEle(channel,productFlag).sendKeys(s);
    }

    /**
     * 获取保额输入input框Ele
     * @return
     */
    private static WebElement getInsuranceInputEle(String channel,String productFlag){
        String property = paramProperties.getProperty("" + channel + "." + productFlag + ".insuranceInputEle");
        return OperateElement.waitByXpath(property);
    }

    /**
     * 投保地区下拉框
     * @return
     */
    private static WebElement area(String channel,String productFlag){
        String property = paramProperties.getProperty("" + channel + "." + productFlag + ".area");
        return OperateElement.waitByXpath(property);
    }

    /**
     * 页面上展示的完成按钮
     * @return
     */
    private static WebElement wanchengButt(String channel, String productFlag){
        String property = paramProperties.getProperty(channel + "." + productFlag + ".wanchengButt");
        return OperateElement.waitByXpath(property);
    }

    /**
     * 完成按钮（另一种class唯一定位之完成）
     * @return
     */
    private static WebElement insurediBirthWanchengButt(String channel, String productFlag){
        String property = paramProperties.getProperty(channel + "." + productFlag + ".insurediBirthWanchengButt");
        return OperateElement.waitByXpath(property);
    }

    /**
     * 交费期间下拉框
     * @return
     */
    private static WebElement jiaoFeiQiJian(String channel,String productFlag){
        String property = paramProperties.getProperty("" + channel + "." + productFlag + ".jiaoFeiQiJian");
        return OperateElement.waitByXpath(property);
    }


    /**
     * 往保费的input框输入保费
     * @param insurance
     */
    public static void insertInsurance(int insurance,String channel,String productFlag){
        String s = String.valueOf(insurance);
        getInsuranceInputEle(channel,productFlag).sendKeys(s);
    }


    /**
     * 点击立即投保
     * 跳转至健康告知页面
     */
    public static void clickDoInsureNowButtToHealthPage(String channel,String productFlag){
        OperateElement.threadSleep(3000);
        OperateElement.myclick(getDoInsureNowButt(channel,productFlag));
    }

    /**
     * 投保地区选择
     * @param channel
     * @param productFlag
     */
    public static void areaChoose(String channel,String productFlag){
        OperateElement.myclick(area(channel,productFlag));
        OperateElement.threadSleep(1000);
        OperateElement.myclick(wanchengButt(channel,productFlag));
    }

    /**
     * 交费期间选择选择
     * @param channel
     * @param productFlag
     */
    public static void jiaoFeiQiJianChoose(String channel,String productFlag){
        OperateElement.myclick(jiaoFeiQiJian(channel,productFlag));
        OperateElement.myclick(wanchengButt(channel,productFlag));
    }
    /**
     * 被保人出生日期选择选择
     * @param channel
     * @param productFlag
     */
    public static void selectBirthday(String channel,String productFlag){
        //点击出生日期，弹出日期插件
        OperateElement.myclick(insuredBirthDateEle(channel,productFlag));
        //点击完成,自动带出系统默认日期
        OperateElement.myclick(insurediBirthWanchengButt(channel,productFlag));
    }

}
