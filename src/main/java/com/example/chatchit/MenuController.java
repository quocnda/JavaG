package com.example.chatchit;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController extends CommonController {

    @FXML
    private AnchorPane MenuPane;

    @FXML
    private Button startChatButton;

    @FXML
    void intoChat(MouseEvent event) throws IOException {
        switchScene("ChatFXML.fxml");
    }
}