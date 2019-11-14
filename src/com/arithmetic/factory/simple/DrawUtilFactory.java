package com.arithmetic.factory.simple;

import com.arithmetic.factory.simple.impl.Circle;
import com.arithmetic.factory.simple.impl.Triangle;

/**
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/11/14 4:10 下午
 **/
public class DrawUtilFactory {

    public static DrawFactory getDraw(String type){
        DrawFactory drawFactory = null;
        if ("Circle".equals(type)){
            drawFactory = new Circle();
        }
        else if ("Triangle".equals(type)){
            drawFactory = new Triangle();
        }
        else {
            throw new RuntimeException();
        }

        return drawFactory;
    }
}
