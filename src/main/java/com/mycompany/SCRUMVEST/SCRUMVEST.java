package com.mycompany.SCRUMVEST;

import com.mycompany.SCRUMVEST.config.JavaFx;
import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SCRUMVEST {
    public static void main(String[] args) {
        Application.launch(JavaFx.class, args);
    }
}