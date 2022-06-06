package com.hunyia.javafx;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * @author:hunyiha
 * @date： 2022年06月07日
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        b1.setLayoutX(0);
        b1.setLayoutY(0);
        b1.setPrefWidth(50);
        b1.setPrefHeight(50);
        b2.setLayoutX(100);
        b2.setLayoutY(100);
        b2.setPrefWidth(50);
        b2.setPrefHeight(50);
        b3.setLayoutX(200);
        b3.setLayoutY(200);
        b3.setPrefWidth(50);
        b3.setPrefHeight(50);

        /**
         * Group就是一个单纯的容器，并不会管你的布局，多个Button放在Group中会覆盖，除非你自己设置button的位置
         *
         * Group管理一个组，某些属性我们可以直接给Group设置，那么它的子组件也会同样生效
         */
        Group group = new Group();
        // 添加组件
        group.getChildren().addAll(b1, b2, b3);
        // 设置Group组的不透明度，它的子组件同样也会生效
        group.setOpacity(0.5);
        // 检查某一个坐标是否存在组件(特别注意：他只是检测组件左上角的坐标位置，其它地方不检查)
        boolean contains = group.contains(0, 0);
        System.out.println(contains);

        /**
         *  获取所有的子节点，然后批量设置属性
         */
        Object[] objects = group.getChildren().toArray();
        for (Object object : objects) {
            Button button = (Button) object;
            button.setPrefHeight(150);
            button.setPrefWidth(150);
        }

        /**
         * 设置节点的监听
         */
        group.getChildren().addListener(new ListChangeListener<Node>() {
            @Override
            public void onChanged(Change<? extends Node> c) {
                System.out.println("当前子组件数量： " + c.getList().size());
            }
        });

        /**
         * Button添加单击事件
         */
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Button button = new Button("b4");
                group.getChildren().add(button);
                System.out.println("我被点击了。。。。");
            }
        });


        // group移除组件  clear()全部清除
        group.getChildren().remove(0);

        // 设置group自动管理子组件的size，默认是true  设置成false后，宽高变成了0,就看不见了，一般我们都不用这个方法
        group.setAutoSizeChildren(true);

        Scene scene = new Scene(group);

        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.setTitle("javafx");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
