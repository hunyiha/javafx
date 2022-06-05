package com.hunyiha.javafx;

import javafx.application.Application;

/**
 * javafx启动方式3
 * @author:hunyiha
 * @date： 2022年06月05日
 */
public class Main3 {
    public static void main(String[] args) {
        /**
         * 这种方式将界面和主程序完全解耦
         */
        Application.launch(Launch.class, args);
    }
}
