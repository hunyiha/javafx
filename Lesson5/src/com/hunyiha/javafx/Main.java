package com.hunyiha.javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

/**
 * @author:hunyiha
 * @date： 2022年06月06日
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        /**
         * 其实这里并不是多线程，只是队列
         * 这里可以帮你更新UI界面，但是更新太频繁，可能造成无响应、软件卡死
         * JAVAFX多任务，后续有介绍
         */
        Platform.runLater(() -> {
            // 线程名称： JavaFX Application Thread   其实就是UI线程
            System.out.println("run方法线程名臣" + Thread.currentThread().getName());
            System.out.println("asdfsfh");

            /**
             * 可以在run中进行这样简单的属性更改，下载文件千万别在这里做，一定会卡死的
             */
            int i = 0;
            while (i < 10){
                System.out.println("i = " + i);
                i++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("runLater下面");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
