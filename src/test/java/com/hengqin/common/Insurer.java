package com.hengqin.common;

/**
 * 保人类
 */
public class Insurer {
    private String name;
    private String idCardNum;
    private String phoneNumber;
    private String Email;
    private String detailAddress;

    public Insurer(String name, String idCardNum, String phoneNumber, String email, String detailAddress) {
        this.name = name;
        this.idCardNum = idCardNum;
        this.phoneNumber = phoneNumber;
        Email = email;
        this.detailAddress = detailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }
}
