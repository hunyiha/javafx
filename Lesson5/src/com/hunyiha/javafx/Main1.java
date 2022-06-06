package com.hunyiha.javafx;

import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.stage.Stage;

/**
 * 平台工具的使用
 * @author:hunyiha
 * @date： 2022年06月06日
 */
public class Main1  extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        /**
         * 设置为false,即使所有的窗口都被关闭，程序都不会退出
         * 其实这里用处不大，正常程序都是关闭所有的就关闭，除非你想干坏事
         */
        Platform.setImplicitExit(false);

        /**
         * 是否支持3D效果
         */
        Platform.isSupported(ConditionalFeature.SCENE3D);

        /**
         * 是否只是FXML
         */
        Platform.isSupported(ConditionalFeature.FXML);

        /**
         * ConditionalFeature里面还有很多属性，具体参考API
         */
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

