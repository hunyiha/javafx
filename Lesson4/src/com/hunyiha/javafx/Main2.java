package com.hunyiha.javafx;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * 模态化窗口：WINDOW_MODAL模式demo
 * @author:hunyiha
 * @date： 2022年06月06日
 */
public class Main2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Stage s1 = new Stage();
        s1.setTitle("s1");
        s1.show();

        Stage s2 = new Stage();
        s2.setTitle("s2");
        /**
         * 设置s1是s2窗口的拥有者
         */
        s2.initOwner(s1);
        s2.initModality(Modality.WINDOW_MODAL);
        s2.show();


        /**
         * 设置模态:APPLICATION_MODAL(窗口不关闭的话，别的窗口不能使用)
         *         WINDOW_MODAL(这个要生效的话需要设置拥有者，设置拥有者之后，就和APPLICATION_MODAL等效)
         *
         */

    }

    public static void main(String[] args) {
        launch(args);

    }
}
