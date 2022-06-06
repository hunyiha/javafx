package com.hunyiha.javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author:hunyiha
 * @date： 2022年06月05日
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        /**
         * 默认Stage是DECORATED
         */
        Stage s1 = new Stage();
        s1.setTitle("s1");
        s1.initStyle(StageStyle.DECORATED);
        s1.show();

        /**
         * 透明的
         */
        Stage s2 = new Stage();
        s2.setTitle("s2");
        s2.initStyle(StageStyle.TRANSPARENT);
        s2.show();

        Stage s3 = new Stage();
        s3.setTitle("s3");
        s3.show();

        Stage s4 = new Stage();
        s4.setTitle("s4");
        s4.show();

        Stage s5 = new Stage();
        s5.setTitle("s5");
        s5.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
