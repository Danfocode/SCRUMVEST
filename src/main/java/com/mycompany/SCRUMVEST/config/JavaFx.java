/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SCRUMVEST.config;


import com.mycompany.SCRUMVEST.SCRUMVEST;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class JavaFx extends Application {
    private ApplicationContext springContext;
    @Override
    public void init() {
        springContext = SpringApplication.run(SCRUMVEST.class);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/scrumvest/scrumvest/ui/common/MainView.fxml"));
        loader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(loader.load());
        scene.getStylesheets().add(getClass().getResource("/com/scrumvest/scrumvest/ui/styles/application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Scrumvest");
        primaryStage.show();
    }
}