package com.hunyiha.javafx;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * javafx的生命周期方法
 * 所有组件都会运行在一个UI线程里面，所有程序为了防止界面阻塞，它会分好几个线程运行
 *      有做多任务的、有专门更新界面的
 * @author:hunyiha
 * @date： 2022年06月05日
 */
public class Main extends Application {
    @Override
    public void init(){
        //  JavaFX-Launcher线程
        System.out.println("这是init()方法" + Thread.currentThread().getName());
    }

    @Override
    public void start(Stage primaryStage){
        // JavaFX Application Thread  这就是个UI线程  所有的组件都应该写在UI线程里面，也就是写在start()方法里面
        System.out.println("这是start()方法" + Thread.currentThread().getName());
        // show窗口
        primaryStage.show();
    }

    @Override
    public void stop(){
        // JavaFX Application Thread  这就是个UI线程
        System.out.println("这是stop()方法" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // main线程，这是一个主线程
        System.out.println("这是main()方法" + Thread.currentThread().getName());
        launch(args);
    }
}
