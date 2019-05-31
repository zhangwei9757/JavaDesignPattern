package com.zhangwei9757.top.structmode.composite;

interface Component {
    void add(Component c);

    void remove(Component c);

    Component getChild(int i);

    void operation();
}