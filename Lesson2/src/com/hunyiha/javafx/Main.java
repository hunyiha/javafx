package com.hunyiha.javafx;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * javafx的生命周期方法
 * @author:hunyiha
 * @date： 2022年06月05日
 */
public class Main extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("这是init()方法");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("这是start()方法");
        // show窗口
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("这是stop()方法");
    }

    public static void main(String[] args) {
        System.out.println("这是main()方法");
        launch(args);
    }
}
