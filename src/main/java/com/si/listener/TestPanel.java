package com.si.listener;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestPanel {
    public static void main(String[] args) {
        //新建一个窗体
        Frame frame = new Frame("新年快乐");
        //新建一个面板
        Panel panel = new Panel(null);
        //设置窗体的布局
        frame.setLayout(null);

        frame.setBounds(300,300,500,500);
        //设置背景颜色
        frame.setBackground(new Color(0,0,255));
        panel.setBounds(50,50,300,300);
        panel.setBackground(new Color(255,0,0));
        frame.add(panel);

        frame.setVisible(true);

        //监听关闭事件
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("打开");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("关闭中");
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("关闭");
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("已激活");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("未激活");
            }
        });
    }
}
