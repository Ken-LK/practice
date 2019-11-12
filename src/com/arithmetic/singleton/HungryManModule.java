package com.arithmetic.singleton;

/**
 * 单例模式 -- 饿汉式  缺点：初始化加载，可能浪费资源
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/11/12 3:16 下午
 **/
public class HungryManModule {

    /**
     * 私有化构造方法
     */
    private HungryManModule(){

    }

    /**
     * 初始化加载生成实体类
     */
    private static final HungryManModule hungryManModule = new HungryManModule();

    /**
     * 对外提供获取实体类方法
     */
    public static HungryManModule getInstance(){
        return hungryManModule;
    }

}
