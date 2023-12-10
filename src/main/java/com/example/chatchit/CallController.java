package com.example.chatchit;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class CallController extends CommonController {

    @FXML
    void backToChat(MouseEvent event) {
        switchScene("ChatFXML.fxml");
    }

}
