package com.example.chatchit;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class CommonController {
    public void switchScene(String s) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(s));
            Scene scene = new Scene(fxmlLoader.load());
            Main.stageMain.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
