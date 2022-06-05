package com.hunyiha.javafx;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * javafx启动方式1
 * @author:hunyiha
 * @date： 2022年06月05日
 */
public class Main1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("这是javafx启动方式1");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
