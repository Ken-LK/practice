package com.arithmetic.prototype.shallow;

/**
 * 客户住址--浅拷贝
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/12/13 2:41 下午
 **/
public class Address {

    private String street;
    private int code;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
