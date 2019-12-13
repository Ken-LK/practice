package com.arithmetic.prototype.deep;

import java.io.Serializable;

/**
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/12/13 3:39 下午
 **/
public class AddressDeep implements Serializable {
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
