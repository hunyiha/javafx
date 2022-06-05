package com.hunyiha.javafx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author:hunyiha
 * @date： 2022年06月05日
 */
public class Main extends Application {

    /*
        Stage就是一个窗口
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        // 如果不想使用primaryStage可以自己new一个出来

        // 设置标题title
        primaryStage.setTitle("这是一个title");
        /**
         * 设置图标  如果是绝对路径，需要在路径前面加上file:
         * https://www.stickpng.com/  这是一个图标网站
         */
        primaryStage.getIcons().add(new Image("/icon/icon.png"));

        /**
         * 设置最小化  默认是false
         */
//        primaryStage.setIconified(true);

        /**
         * 设置最大化
         */
//        primaryStage.setMaximized(true);

        /**
         * 设置宽和高
         */
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);

        /**
         *设置窗口尺寸不能改变
         */
//        primaryStage.setResizable(false);

        /**
         * 设置最大和最小的宽度和高度
         */
        primaryStage.setMaxWidth(800);
        primaryStage.setMaxHeight(800);
        primaryStage.setMinWidth(300);
        primaryStage.setMinHeight(300);

        /**
         * 获取窗口的宽和高
         *      Tips: 如果没有设置宽和高，需要在show()方法执行之后才能获取
         */
        System.out.println("当前宽度： " + primaryStage.getWidth());
        System.out.println("当前高度： " + primaryStage.getHeight());

        /**
         * 设置监听，观察者模式
         *      Tips:这里可以做自动适应功能
         */
        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("当前高度： " + newValue);
            }
        });

        /**
         * 设置全屏   设置全屏必须设置Scene
         */
        primaryStage.setFullScreen(true);
        primaryStage.setScene(new Scene(new Group()));

        /**
         * 设置背景不透明度
         *      0完全透明
         *      1完全不透明
         */
        primaryStage.setOpacity(0.5);

        // 显示窗口
        primaryStage.show();

        /**
         * 设置关闭窗口
         */
//        primaryStage.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
