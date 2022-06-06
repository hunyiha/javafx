package com.hunyiha.javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * 获取屏幕相关信息
 * @author:hunyiha
 * @date： 2022年06月06日
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Screen screen = Screen.getPrimary();

        System.out.println("--------------屏幕宽度很高度--------------");
        /**
         * 获取全部的屏幕宽度和高度(包括用户不能看见的)
         */
        Rectangle2D bounds = screen.getBounds();
        System.out.println("左上角X:" + bounds.getMinX() + " 左上角Y: " + bounds.getMinY());
        System.out.println("右下角X:" + bounds.getMaxX() + " 右下角Y: " + bounds.getMaxY());
        System.out.println("宽度:" + bounds.getWidth() + " 高度: " + bounds.getHeight());

        System.out.println("--------------可视化屏幕宽度很高度--------------");

        /**
         * 获取用户能看见的屏幕宽度和高度(可视化的宽度和高度)
         */
        Rectangle2D visualBounds = screen.getVisualBounds();
        System.out.println("左上角X:" + visualBounds.getMinX() + " 左上角Y: " + visualBounds.getMinY());
        System.out.println("右下角X:" + visualBounds.getMaxX() + " 右下角Y: " + visualBounds.getMaxY());
        System.out.println("宽度:" + visualBounds.getWidth() + " 高度: " + visualBounds.getHeight());

        /**
         * 屏幕DPI
         */
        double dpi = screen.getDpi();
        System.out.println("当前屏幕DPI: " + dpi);

        Platform.exit();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
