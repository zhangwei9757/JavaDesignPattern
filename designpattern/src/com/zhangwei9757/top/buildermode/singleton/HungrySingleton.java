package com.zhangwei9757.top.buildermode.singleton;

/**
 * Created by zw on 2019-5-30
 * <p>
 */
public class HungrySingleton {

    /**
     * 饿汉式模式
     * INSTANCE
     */
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
