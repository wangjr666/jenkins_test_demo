package com.hengqin.pageobject;

import com.hengqin.common.Insurer;
import com.hengqin.common.OperateElement;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * 投保录入页
 */
public class InformationWritePO extends BasePage{
    /**
     * 投保人姓名input框Ele
     */
    private static WebElement getNameInputEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".nameInputEle"));
    }

    /**
     * 投保人证件号码input框Ele
     */
    private static WebElement getCardIdInputEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".cardIdInputEle"));
    }

    /**
     * 被保人姓名input框Ele
     */
    private static WebElement getInsuredNameInputEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredNameInputEle"));
    }

    /**
     * 第二个被保人姓名input框Ele（团险）
     */
    private static WebElement getInsuredNameInputEle1(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredNameInputEle1"));
    }

    /**
     * 被保人证件号码input框Ele
     */
    private static WebElement getInsuredCardIdInputEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredCardIdInputEle"));
    }

    /**
     * 第二个被保人证件号码input框Ele（团险）
     */
    private static WebElement getInsuredCardIdInputEle1(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredCardIdInputEle1"));
    }

    /**
     * 投保人证件有效期选择栏Ele
     */
    private static WebElement getValidityOfCertificateEle(String channel,String productFlag){
        return OperateElement.waitElesByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".validityOfCertificateEle")).get(0);
    }

    /**
     * 投保人手机号input框Ele
     */
    private static WebElement getPhoneInputEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".phoneInputEle"));
    }

    /**
     * 投保人电子邮箱input框Ele
     */
    private static WebElement getEmailInputEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".emailInputEle"));

    }

    /**
     * 投保人投保地区选择栏Ele
     */
    private static WebElement getInsuerAreatEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuerAreatEle"));
    }

    /**
     * 投保人详细地址input框Ele
     */
    private static WebElement getDetailedAddressEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".detailedAddressEle"));
    }

    /**
     * 投保人证件有效期(年)拖拽本体Ele
     * @return
     */
    private static WebElement getInsureExpDataYearEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insureExpDataYearEle"));
    }

    /**
     * 被保人证件有效期(年)拖拽本体Ele
     * @return
     */
    private static WebElement getInsuredExpDataYearEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredExpDataYearEle"));
    }

    /**
     * 第二个被保人证件有效期(年)拖拽本体Ele（团险）
     * @return
     */
    private static WebElement getInsuredExpDataYearEle1(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredExpDataYearEle1"));
    }

    /**
     * 投保人证件有效期里面的完成按钮Ele
     * @author li.tong
     * @return
     */
    private static WebElement getInsureExpDataSuccessButtEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insureExpDataSuccessButtEle"));
    }
    /**
     * 被保人证件有效期里面的完成按钮Ele
     * @author li.tong
     * @return
     */
    private static WebElement getInsuredExpDataSuccessButtEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredExpDataSuccessButtEle"));
    }

    /**
     * 第二个被保人证件有效期里面的完成按钮Ele（团险）
     * @author li.tong
     * @return
     */
    private static WebElement getInsuredExpDataSuccessButtEle1(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredExpDataSuccessButtEle1"));
    }

    /**
     * 页面显示完成按钮Ele
     * @author li.tong
     * @return
     */
    private static WebElement wanchengInPageButtEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".wanchengButt"));
    }

    /**
     * 获取投保人职业选择Ele
     * @return
     */
    private static WebElement getPolicyholderJobEle(String channel,String productFlag) {
        return OperateElement.waitElesByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".jobEle")).get(0);
    }

    /**
     * 获取被保人职业选择Ele
     * @return
     */
    private static WebElement getInsuredJobEle(String channel,String productFlag) {
        List<WebElement> webElements = OperateElement.waitElesByXpath(paramProperties.getProperty("" + channel + "." + productFlag + ".jobEle"));
        if (
                webElements.size()>1
        ){
            return OperateElement.waitElesByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".jobEle")).get(1);
        }
        return OperateElement.waitElesByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".jobEle")).get(0);
    }


    /**
     * 投保人职业选择栏的完成按钮Ele
     */
    private static WebElement getPolicyholderJobViewSuccessEle(String channel,String productFlag){
        return OperateElement.waitElesByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".jobViewSuccessEle")).get(0);
    }

    /**
     * 被保人职业选择栏的完成按钮Ele
     */
    private static WebElement getInsuredJobEleViewSuccessEle(String channel, String productFlag){
        List<WebElement> webElements = OperateElement.waitElesByXpath(paramProperties.getProperty("" + channel + "." + productFlag + ".jobViewSuccessEle"));
        if (
                webElements.size()>1
        ){
            return OperateElement.waitElesByXpath(paramProperties.getProperty("" + channel + "." + productFlag + ".jobViewSuccessEle")).get(1);
        }
        return OperateElement.waitElesByXpath(paramProperties.getProperty("" + channel + "." + productFlag + ".jobViewSuccessEle")).get(0);
    }

    /**
     * 团险投保人信息栏元素
     * @author li.tong
     * @return
     */
    private static WebElement policyHolderButt(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".policyHolderButt"));
    }

    /**
     * 为谁投保（投被保人关系）（团险）
     * @author li.tong
     * @return
     */
    private static WebElement insuredWhoEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredWhoEle"));
    }

    /**
     * 为谁投保（投被保人关系，第二个被保人）（团险）
     * @author li.tong
     * @return
     */
    private static WebElement insuredWhoEle1(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredWhoEle1"));
    }

    /**
     * 被保人与投保人关系
     * @author li.tong
     * @return
     */
    private static WebElement insuredRelationEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredRelationEle"));
    }


    /**
     * 被保人与投保人关系（拖拽本体）
     * @author li.tong
     */
    private static WebElement insuredRelationDropEle(String channel,String productFlag){
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredRelationDropEle"));
    }

    /**
     * 选择投保人默认职业
     */
    public static void selectPolicyholderDefultJob(String channel,String productFlag) {
        //点击职业栏元素调出职业选择栏
        OperateElement.myclick(getPolicyholderJobEle(channel,productFlag));
        OperateElement.threadSleep(1000);
        //因为默认会选中一个，所以直接点击完成按钮即可得到选择默认的职业
        OperateElement.myclick(getPolicyholderJobViewSuccessEle(channel,productFlag));
    }

    /**
     * 选择被保人默认职业
     */
    public static void selectInsuredDefultJob(String channel, String productFlag) {
        OperateElement.scrollIntoView(getInsuredJobEle(channel,productFlag));
        //点击职业栏元素调出职业选择栏
        OperateElement.myclick(getInsuredJobEle(channel,productFlag));
        OperateElement.threadSleep(1000);
        //因为默认会选中一个，所以直接点击完成按钮即可得到选择默认的职业
        OperateElement.myclick(wanchengInPageButtEle(channel,productFlag));
    }

    /**
     * 选择被保人与投保人关系(为本人)(当页面默认非本人时使用此方法)
     * @author li.tong
     */
    public static void selectInsuredRelation(String channel, String productFlag) {
        OperateElement.scrollIntoView(insuredRelationEle(channel,productFlag));
        //点击被保人与投保人关系
        OperateElement.myclick(insuredRelationEle(channel,productFlag));
        OperateElement.threadSleep(1000);
        //将关系元素向前滚动
        OperateElement.scrollH5(insuredRelationDropEle(channel,productFlag),0,-100);
        //完成按钮
        OperateElement.myclick(wanchengInPageButtEle(channel,productFlag));
    }


    /**
     * 获取条款点击框Eles
     * 一共两个所以返回一个list
     * @return
     */
    private static List<WebElement> getTermsEles(String channel,String productFlag) {
        return OperateElement.waitElesByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".termsEles"));
    }


    /**
     * 是否自动续保-否Eles
     * @return
     */
    private static WebElement notRevenal(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".notRevenal"));
    }

    /**
     * 返回投保录入页的立即投保按钮Ele
     * @return
     */
    private static WebElement getInsuerNowButt(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuerNowButt"));
    }

    /**
     * 团险投保人是否有社保元素
     * @return
     */
    private static WebElement socialSecurity(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".socialSecurity"));
    }

    /**
     * 被保人证件类型
     * @return
     */
    private static WebElement insuredCardTypeEle(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredTypeOfCertificateEle"));
    }
    /**
     * （第二个）被保人证件类型（团险）
     * @return
     */
    private static WebElement insuredCardTypeEle1(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredTypeOfCertificateEle1"));
    }

    /**
     * 获取团险家庭成员选择框Eles
     * 一共两个所以返回一个list
     * @return
     */
    private static List<WebElement> getFamilyTermsEles(String channel,String productFlag) {
        return OperateElement.waitElesByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".familyTermsEles"));
    }

    /**
     * 被保人证件有效期元素获取
     * @return
     */
    private static WebElement insuredValidityOfCertificateEle(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredValidityOfCertificateEle"));
    }
    /**
     * 被保人证件有效期元素获取
     * @return
     */
    private static WebElement insuredValidityOfCertificateEle1(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredValidityOfCertificateEle1"));
    }

    /**
     * 团险被保人职业选择元素
     * @return
     */
    private static WebElement insuredJobEle(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredJobEle"));
    }

    /**
     * 团险第二个被保人职业选择元素
     * @return
     */
    private static WebElement insuredJobEle1(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredJobEle1"));
    }

    /**
     * 团险被保人是否有社保元素
     * @return
     */
    private static WebElement insuredSocialSecurity(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredSocialSecurity"));
    }

    /**
     * 团险第二个被保人是否有社保元素
     * @return
     */
    private static WebElement insuredSocialSecurity1(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".insuredSocialSecurity1"));
    }

    /**
     * 团险个人信息确认按钮
     * @return
     */
    private static WebElement confirmSelfEle(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".confirmSelfButt"));
    }

    /**
     * 团险被保人信息确认按钮
     * @return
     */
    private static WebElement confirmInsuredBtn(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".confirmInsuredBtn"));
    }

    /**
     * 团险第二个被保人信息确认按钮
     * @return
     */
    private static WebElement confirmInsuredBtn1(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".confirmInsuredBtn1"));
    }

    /**
     * 团险新增被保人按钮
     * @return
     */
    private static WebElement addInsuredBtn(String channel,String productFlag) {
        return OperateElement.waitByXpath(paramProperties.getProperty(""+channel+"."+productFlag+".addInsuredBtn"));
    }

    /**
     * 改变投保人证件有效期的值
     * 其实就是拖拽投保人证件有效期(年)
     */
    public static void changeInsureExpData(String channel,String productFlag){
        OperateElement.threadSleep(1000);
        OperateElement.myclick(getValidityOfCertificateEle(channel,productFlag));
        OperateElement.threadSleep(1000);
        OperateElement.flick(getInsureExpDataYearEle(channel,productFlag),0,-100);
        OperateElement.myclick(getInsureExpDataSuccessButtEle(channel,productFlag));
    }

    /**
     * 输入姓名
     */
    public static void insertName(String name,String channel,String productFlag){
        getNameInputEle(channel,productFlag).sendKeys(name);
    }

    /**
     * 输入被保人姓名
     * @author li.tong
     */
    public static void insertInsuredName(String name,String channel,String productFlag){
        getInsuredNameInputEle(channel,productFlag).sendKeys(name);
    }

    /**
     * 输入（第二个）被保人姓名（团险）
     * @author li.tong
     */
    public static void insertInsuredName1(String name,String channel,String productFlag){
        getInsuredNameInputEle1(channel,productFlag).sendKeys(name);
    }

    /**
     * 输入证件号码
     */
    public static void insertCardId(String cardId,String channel,String productFlag){
        getCardIdInputEle(channel,productFlag).sendKeys(cardId);
    }

    /**
     * 输入被保人证件号码
     * @author li.tong
     */
    public static void insertInsuredCardId(String cardId,String channel,String productFlag){
        getInsuredCardIdInputEle(channel,productFlag).sendKeys(cardId);
    }

    /**
     * 输入第二个被保人证件号码（团险）
     * @author li.tong
     */
    public static void insertInsuredCardId1(String cardId,String channel,String productFlag){
        getInsuredCardIdInputEle1(channel,productFlag).sendKeys(cardId);
    }


    /**
     * 输入手机号
     */
    public static void insertPhoneNumber(String phoneNumber,String channel,String productFlag){
        getPhoneInputEle(channel,productFlag).sendKeys(phoneNumber);
    }

    /**
     * 输入电子邮件
     */
    public static void insertEmail(String email,String channel,String productFlag){
        getEmailInputEle(channel,productFlag).sendKeys(email);
    }

    /**
     * 投保地区选择
     */
    public static void chooseInsureArea(String channel,String productFlag){

        OperateElement.myclick(getInsuerAreatEle(channel,productFlag));
        OperateElement.threadSleep(2000);
        WebElement doneEle = OperateElement.waitElesByXpath("//div/div/div/div/div[contains(text(),'完成')]").get(6);
        OperateElement.myclick(doneEle);
    }

    /**
     * 投保地区选择
     * @author li.tong
     */
    public static void chooseInsureAreaGuanwei(String channel,String productFlag){
        OperateElement.myclick(getInsuerAreatEle(channel,productFlag));
        OperateElement.threadSleep(2000);
        OperateElement.myclick(wanchengInPageButtEle(channel,productFlag));
//        WebElement doneEle = OperateElement.waitByXpath(""+channel+"."+productFlag+".wanchengButt");
//        OperateElement.myclick(doneEle);
    }


    /**
     * 输入详细地址
     */
    public static void insertDetailAddress(String detailAdd,String channel,String productFlag){
        getDetailedAddressEle(channel,productFlag).sendKeys(detailAdd);
    }

    /**
     * 通过传一个保人对象来对投保人信息栏赋值
     * @param insurer
     */
    public static void sendPolicyHolderInfo(Insurer insurer, String channel, String productFlag){
        insertName(insurer.getName(),channel,productFlag);
        insertCardId(insurer.getIdCardNum(),channel,productFlag);
        insertPhoneNumber(insurer.getPhoneNumber(),channel,productFlag);
        insertEmail(insurer.getEmail(),channel,productFlag);
        insertDetailAddress(insurer.getDetailAddress(),channel,productFlag);
    }

    /**
     * 通过传一个保人对象来对被保人信息栏赋值（团险）
     * @param insurer
     */
    public static void sendInsuredInfo(Insurer insurer, String channel, String productFlag){
        insertInsuredName(insurer.getName(),channel,productFlag);
        insertInsuredCardId(insurer.getIdCardNum(),channel,productFlag);
    }

    /**
     * 通过传一个保人对象来对第二个被保人信息栏赋值（团险）
     * @param insurer
     */
    public static void sendInsuredInfo1(Insurer insurer, String channel, String productFlag){
        insertInsuredName1(insurer.getName(),channel,productFlag);
        insertInsuredCardId1(insurer.getIdCardNum(),channel,productFlag);
    }


    /**
     * 勾选条款
     */
    public static void clickTerms(String channel,String productFlag){
        //先把页面滚动到页面底部
        //OperateElement.scrollIntoView(getTermsEles(channel,productFlag).get(1));此行官微无效，替换为下一行方法
        OperateElement.scrollIntoBottom();
        //然后逐个点击条款
        for (WebElement ele:getTermsEles(channel,productFlag)
             ) {
            OperateElement.myclick(ele);
        }
    }

    /**
     * 自动续保选择否
     * @author li.tong
     */
    public static void clickNotRevenal(String channel,String productFlag) {
        OperateElement.myclick(notRevenal(channel, productFlag));
    }


    /**
     * 点击投保录入页的立即投保按钮
     */
    public static void clickInsuerNowButtonToPayPage(String channel,String productFlag) {
        OperateElement.myclick(getInsuerNowButt(channel,productFlag));
        OperateElement.threadSleep(5000);
    }

    /**
     * 点击打开团险投保人信息栏
     */
    public static void openPolicyHolderInfo(String channel,String productFlag) {
        OperateElement.myclick(policyHolderButt(channel,productFlag));
    }

    /**
     * 团险投保人社保选择“有”
     */
    public static void setSocialSecurity(String channel,String productFlag) {
        OperateElement.myclick(socialSecurity(channel,productFlag));
    }

    /**
     * 点击团险个人信息确认
     */
    public static void clickConfirmSelf(String channel,String productFlag) {
        OperateElement.myclick(confirmSelfEle(channel,productFlag));
    }

    /**
     * 点击团险新增被保人
     */
    public static void clickAddInsure(String channel,String productFlag){
        OperateElement.myclick(addInsuredBtn(channel,productFlag));
    }
    /**
     *  点击（被保人）为谁投保(团险)
     */
    public static void selectInsuredWhoEle(String channel,String productFlag){
        OperateElement.myclick(insuredWhoEle(channel,productFlag));
        OperateElement.myclick(wanchengInPageButtEle(channel,productFlag));
    }

    /**
     *  点击（第二个被保人）为谁投保(团险)
     */
    public static void selectInsuredWhoEle1(String channel,String productFlag){
        OperateElement.myclick(insuredWhoEle1(channel,productFlag));
        OperateElement.myclick(wanchengInPageButtEle(channel,productFlag));
    }

    /**
     * 选择被保人证件类型（为默认值身份证）
     */
    public static void selectInsuredCardType(String channelFlag, String productFlag) {
        OperateElement.myclick(insuredCardTypeEle(channelFlag, productFlag));
        OperateElement.myclick(wanchengInPageButtEle(channelFlag, productFlag));
    }

    /**
     * （团险）选择第二个被保人证件类型（为默认值身份证）
     */
    public static void selectInsuredCardType1(String channelFlag, String productFlag) {
        OperateElement.myclick(insuredCardTypeEle1(channelFlag, productFlag));
        OperateElement.myclick(wanchengInPageButtEle(channelFlag, productFlag));
    }

    /**
     * 调整被保人证件有效期往后三年
     */
    public static void changeInsuredExpData(String channelFlag, String productFlag) {
        OperateElement.scrollIntoView(insuredValidityOfCertificateEle(channelFlag,productFlag));
        OperateElement.myclick(insuredValidityOfCertificateEle(channelFlag,productFlag));
        OperateElement.threadSleep(1000);
        OperateElement.flick(getInsuredExpDataYearEle(channelFlag,productFlag),0,-100);
        OperateElement.myclick(getInsuredExpDataSuccessButtEle(channelFlag,productFlag));
    }
    /**
     * 调整第二个被保人证件有效期往后三年（团险）
     */
    public static void changeInsuredExpData1(String channelFlag, String productFlag) {
        OperateElement.scrollIntoView(insuredValidityOfCertificateEle1(channelFlag,productFlag));
        OperateElement.myclick(insuredValidityOfCertificateEle1(channelFlag,productFlag));
        OperateElement.threadSleep(1000);
        OperateElement.flick(getInsuredExpDataYearEle1(channelFlag,productFlag),0,-100);
        OperateElement.myclick(getInsuredExpDataSuccessButtEle1(channelFlag,productFlag));
    }

    /**
     * 被保人是否有社保选择是
     */
    public static void setInsuredSocialSecurity(String channelFlag, String productFlag) {
        OperateElement.myclick(insuredSocialSecurity(channelFlag, productFlag));
    }

    /**
     * 第二个被保人是否有社保选择是（团险）
     */
    public static void setInsuredSocialSecurity1(String channelFlag, String productFlag) {
        OperateElement.myclick(insuredSocialSecurity1(channelFlag, productFlag));
    }

    /**
     * 选择被保人职业（团险）
     */
    public static void selectInsuredJob(String channelFlag, String productFlag) {
        OperateElement.myclick(insuredJobEle(channelFlag, productFlag));
        OperateElement.myclick(wanchengInPageButtEle(channelFlag, productFlag));
    }

    /**
     * 选择第二个被保人职业（团险）
     */
    public static void selectInsuredJob1(String channelFlag, String productFlag) {
        OperateElement.myclick(insuredJobEle1(channelFlag, productFlag));
        OperateElement.myclick(wanchengInPageButtEle(channelFlag, productFlag));
    }

    /**
     * 点击被保信息确认
     */
    public static void clickConfirmInsuredBtn(String channelFlag, String productFlag) {
        OperateElement.myclick(confirmInsuredBtn(channelFlag, productFlag));
    }

    /**
     * 点击第二个被保信息确认（团险）
     */
    public static void clickConfirmInsuredBtn1(String channelFlag, String productFlag) {
        OperateElement.myclick(confirmInsuredBtn1(channelFlag, productFlag));
    }

    /**
     * 团险勾选被保人
     */
    public static void clickFamilyTerms(String channel,String productFlag){
        //逐个点击
        for (WebElement ele:getFamilyTermsEles(channel,productFlag)
        ) {
            OperateElement.myclick(ele);
        }
    }
}
