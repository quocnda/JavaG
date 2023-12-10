package com.example.chatchit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static Stage stageMain;
    @Override
    public void start(Stage stage) throws IOException {
        stageMain = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stageMain.setTitle("ChatChit");
        stageMain.setResizable(false);
        stageMain.setScene(scene);
        stageMain.show();
    }

    public static void main(String[] args) {
        launch();
    }
}