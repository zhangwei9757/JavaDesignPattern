package com.zhangwei9757.top.buildermode.prototype;

/**
 * Created by zw on 2019-5-30
 * <p>
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Realizetype) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype1 = new Realizetype();
        Realizetype realizetype2 = (Realizetype) realizetype1.clone();
        System.out.println(String.format("obj1 == obj2 ?, %b", realizetype1 == realizetype2));
    }
}
