package com.arithmetic.factory.simple;

/**
 *
 * 使用简单工厂模式设计一个可以创建不同几何形状（如圆形、方形和三角形等）的绘图
 * 工具，每个几何图形都具有绘制draw()和擦除erase()两个方法，要求在绘制不支持的几何
 * 图形时，提示一个UnSupportedShapeException。
 *
 *
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @Author ken
 * @Date 2019/11/14 4:05 下午
 **/
public interface DrawFactory {

    void draw();

    void erase();

}
