package com.hunyiha.javafx;

import javafx.application.Application;
import javafx.application.Platform;
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
         * 默认Stage是DECORATED    常用
         */
//        Stage s1 = new Stage();
//        s1.setTitle("s1");
//        // 初始化窗口类型
//        s1.initStyle(StageStyle.DECORATED);
//        s1.show();

        /**
         * 完全透明的窗口类型        基本不用
         */
//        Stage s2 = new Stage();
//        s2.setTitle("s2");
//        s2.initStyle(StageStyle.TRANSPARENT);
//        s2.show();

        /**
         *  白色的背景窗口类型       基本不用
         */
//        Stage s3 = new Stage();
//        s3.setTitle("s3");
//        s3.initStyle(StageStyle.TRANSPARENT);
//        s3.show();

        /**
         *  拉伸的时候自动填充没有的地方为白色   常用
         */
//        Stage s4 = new Stage();
//        s4.setTitle("s4");
//        s4.initStyle(StageStyle.UNIFIED);
//        s4.show();


        /**
         * 没有最小化和最大化、图标也会消失   常用
         *      属性面板、提交之后选择yes或者no这种就可以使用这个来做
         */
        Stage s5 = new Stage();
        s5.setTitle("s5");
        s5.initStyle(StageStyle.UTILITY);
        s5.show();

        /**
         * 关闭窗口方法：
         *      1.stage.close()
         *      2.Platform.exit();   这个直接JVM都关了
         * 平台工具Platform里面有很多有用的东西
         */
        Platform.exit();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
