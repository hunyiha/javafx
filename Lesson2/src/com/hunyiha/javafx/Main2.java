package com.hunyiha.javafx;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * javafx启动方式2
 * @author:hunyiha
 * @date： 2022年06月05日
 */
public class Main2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("这是javafx启动方式2");
    }

    public static void main(String[] args) {
        // 其实和第一种方式基本是一样的
        Application.launch(Main2.class, args);
    }
}
