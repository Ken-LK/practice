package com.arithmetic.factory.simple.impl;

import com.arithmetic.factory.simple.DrawFactory;

/**
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/11/14 4:08 下午
 **/
public class Triangle implements DrawFactory {
    @Override
    public void draw() {
        System.out.println("三角形绘图");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角形绘图");
    }
}
