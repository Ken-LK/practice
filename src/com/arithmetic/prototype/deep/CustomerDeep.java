package com.arithmetic.prototype.deep;

import java.io.*;

/**
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/12/13 3:39 下午
 **/
public class CustomerDeep implements Serializable,Cloneable {

    private String name;

    private AddressDeep address;


    public CustomerDeep deepclone() throws IOException, ClassNotFoundException {

        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (CustomerDeep)ois.readObject();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressDeep getAddress() {
        return address;
    }

    public void setAddress(AddressDeep address) {
        this.address = address;
    }


}
