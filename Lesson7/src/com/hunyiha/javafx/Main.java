package com.hunyiha.javafx;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;

/**
 * @author:hunyiha
 * @date： 2022年06月07日
 */
public class Main extends Application {
    /**
     * 绝大部分组件父类都是Node，部分菜单栏组件父类是Object
     * 组件node不能直接放在stage上,javafx要求stage-->scene-->node三层
     *
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        URL url = getClass().getClassLoader().getResource("icon/icon.png");
        String path = url.toExternalForm();

        /**
         * 程序运行到这里会使用默认浏览器打开百度
         */
        HostServices host = getHostServices();
        host.showDocument("www.baidu.com");


        /**
         * Button就是一个Node
         *      其实将Button放在Scene里面，下面设置宽高没有作用，他还是会填充整个页面
         *      要避免这个情况出现，需要使用布局类LayOut，然后将button放在它的上面
         */
        Button button = new Button("按钮");
        button.setPrefWidth(200);
        button.setPrefHeight(200);
        /**
         * 设置鼠标移动到button上光标样式
         * 这里可以传String URL
         */
//        button.setCursor(Cursor.MOVE);
        button.setCursor(Cursor.cursor(path));


        /**
         * 一般Scene中的Node会使用布局类，LayOut
         * Group不是布局类，但是它的作用是将很多个组件捆绑在一起，功能相当于布局类
         */
        Group group = new Group();
        /**
         * 将button放在group上面。
         * 所有的布局类添加组件都是先获取getChildren()，然后add()
         */
        group.getChildren().add(button);


        /**
         * 场景创建，必须要有一个node  这个节点Node就是根节点
         * 绝大多数开发场景，Scene只需要new出来，设置node,虽然Scene也有很多方法，
         *      但是基本不使用，不需要对Scene做太多额外的处理,如果需要定制，可以去找它的method
         * 按钮和控件这些上面的方法才有一些使用价值。
         * 直接放在Scene上的Node会随着窗口变化，窗口多大它就多大
         */
//        Scene scene = new Scene(button);
        Scene scene = new Scene(group);

        /**
         * 设置鼠标放到Scene上，光标的样式
         */
        scene.setCursor(Cursor.CLOSED_HAND);

        /**
         * 窗口Stage关联Scene
         */
        primaryStage.setScene(scene);

        primaryStage.setHeight(800);
        primaryStage.setWidth(800);
        primaryStage.setTitle("javafx");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
