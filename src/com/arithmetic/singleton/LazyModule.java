package com.arithmetic.singleton;

/**
 * 单例模式 -- 懒汉式  缺点：有锁，性能有影响
 *
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/11/12 3:21 下午
 **/
public class LazyModule {

    /**
     * 私有构造方法
     */
    private LazyModule() {

    }

    /**
     * 私有成员变量
     * 被volatile修饰的成员变量可以确保多个线程都能够正确处理
     */
    private volatile static LazyModule lazyModule = null;

    /**
     * 对外提供获取入口
     */
    public static LazyModule getInstance() {

        //第一重判断
        if (lazyModule == null) {

            //锁定代码块
            synchronized (LazyModule.class) {

                //防止多线程，进行二重判断
                if (lazyModule == null) {
                    return new LazyModule();
                }
            }
        }

        return lazyModule;
    }


}
