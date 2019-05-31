package com.zhangwei9757.top.objectactionmode.command;

import javax.swing.*;

class ChangFenChef extends JFrame {
    private static final long serialVersionUID = 1L;
    JLabel l = new JLabel();

    ChangFenChef() {
        super("煮肠粉");
        l.setText("煮肠粉");
//        l.setIcon(new ImageIcon("src/command/ChangFen.jpg"));
        this.add(l);
        this.setLocation(30, 30);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void cooking() {
        this.setVisible(true);
    }
}