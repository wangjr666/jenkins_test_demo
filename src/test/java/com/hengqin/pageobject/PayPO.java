package com.hengqin.pageobject;

import com.hengqin.common.OperateElement;
import org.openqa.selenium.WebElement;

public class PayPO extends BasePage{
    /**
     * 付款银行元素
     * @return
     */
    private static WebElement getBankChooseEle(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".payPage.bankChooseEle"));
    }

    /**
     * 付款银行弹出框--完成按钮元素
     * @return
     */
    private static WebElement getBankChooseSuccessEle(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".payPage.bankChooseSuccessEle"));
    }

    /**
     * 付款银行默认选择方法
     */
    public static void bankDefultChoose(String channel){
        //先点击付款银行调出付款银行选择栏
        OperateElement.myclick(getBankChooseEle(channel));
        //直接点击确定，就可以达成选择默认银行的方法
        OperateElement.myclick(getBankChooseSuccessEle(channel));
    }

    /**
     * 银行账号input元素
     * @return
     */
    private static WebElement getBankCardIdInputEle(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".payPage.bankCardIdInputEle"));
    }

    /**
     * 银行账号输入方法
     * @param cardId
     */
    public static void insertBankCardId(String cardId,String channel){
        getBankCardIdInputEle(channel).sendKeys(cardId);
    }

    /**
     * 验证码按钮元素
     * @return
     */
    private static WebElement getGetCaptchaButtonEle(){
        return OperateElement.waitByXpath("//div[contains(text(),'获取验证码')]/..");
    }

    /**
     * 验证码点击方法
     */
    public static void clickGetCaptcha() {
        OperateElement.threadSleep(1000);
        String js = "a=document.getElementsByClassName('btn-get-code')[0].click()";
        OperateElement.executeJs(js);
    }

    /**
     * 验证码点击方法（官微）
     */
    public static void clickGetCaptchaGuanwei(String channel) {
        OperateElement.myclick(OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".payPage.captchaGet")));

    }


    /**
     * 验证码input元素
     * @return
     */
    private static WebElement getCaptchaInputEle(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".payPage.captchaInputEle"));
    }

    /**
     * 验证码输入方法
     * @param captcha
     */
    public static void insertGaptcha(String captcha,String channel) {
        getCaptchaInputEle(channel).sendKeys(captcha);
    }


    /**
     * 协议选择框元素
     * @return
     */
    private static WebElement getTermsSelectEle(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".payPage.termsSelectEle"));
    }

    /**
     * 协议勾选方法
     */
    public static void clickTerms(String channel) {
        OperateElement.scrollIntoView(getTermsSelectEle(channel));
        OperateElement.myclick(getTermsSelectEle(channel));
    }


    /**
     * 确认付款按钮元素
     * @return
     */
    private static WebElement getPayButtonEle(String channel){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+".payPage.payButtonEle"));
    }

    /**
     * 确认付款按钮点击方法
     */
    public static void pay(String channel) {
        OperateElement.myclick(getPayButtonEle(channel));
    }

}
