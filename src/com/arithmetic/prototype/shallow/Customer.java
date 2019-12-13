package com.arithmetic.prototype.shallow;

/**
 * 客户类--浅拷贝
 *
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/12/13 2:40 下午
 **/
public class Customer implements Cloneable {

    private String name;

    private Address address;

    @Override
    public Customer clone() {
        Object obj;

        try {
            obj = super.clone();
            return (Customer) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            return null;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
