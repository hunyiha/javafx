package com.hunyiha.javafx;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author:hunyiha
 * @date： 2022年06月05日
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("hello world");
        // 设置title
        primaryStage.setTitle("这是第一个javafx程序");
        // show窗口
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
