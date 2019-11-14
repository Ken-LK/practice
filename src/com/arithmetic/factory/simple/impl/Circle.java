package com.arithmetic.factory.simple.impl;

import com.arithmetic.factory.simple.DrawFactory;

/**
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/11/14 4:07 下午
 **/
public class Circle implements DrawFactory {

    @Override
    public void draw() {
        System.out.println("圆形绘图");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形绘图");
    }
}
