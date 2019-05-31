package com.zhangwei9757.top.structmode.composite;

public class CompositePattern {
    public static void main(String[] args) {
        Component c0 = new Composite();
        Component leaf1 = new Leaf("1");

        Component c1 = new Composite();
        c0.add(leaf1);
        c0.add(c1);

        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");

        c1.add(leaf2);
        c1.add(leaf3);

        c0.operation();
    }
}