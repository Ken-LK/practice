package com.arithmetic.singleton;

/**
 * 单例模式 -- Initialization Demand Holder (IoDH)模式   解决饿汉式和懒汉式缺点
 *
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/11/12 3:28 下午
 **/
public class IoDHModule {


    /**
     * 私有化构造方法
     */
    private IoDHModule() {

    }

    /**
     * 私有内部类，实例化对象
     */
    private static class HolderClass {

        private final static IoDHModule ioDHModule = new IoDHModule();

    }

    /**
     * 提供外部获取入口
     */
    public static IoDHModule getInstance() {
        return HolderClass.ioDHModule;
    }

    public static void main(String[] args) {

        IoDHModule ioDHModule1 = IoDHModule.getInstance();
        IoDHModule ioDHModule2 = IoDHModule.getInstance();

        System.out.println(ioDHModule1 == ioDHModule2);


    }
}
