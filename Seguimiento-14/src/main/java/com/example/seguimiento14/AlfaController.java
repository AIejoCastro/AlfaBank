package com.example.seguimiento14;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AlfaController {

    @FXML
    private Button registerBttn;

    @FXML
    private Button tableBttn;


    @FXML
    public void registerView(ActionEvent event) {
        registerBttn.setOnAction(Event -> {
            AlfaApplication.openWindow("Register.fxml");
            Stage stage = (Stage) registerBttn.getScene().getWindow();
            stage.close();
        });
    }

    @FXML
    void tableWindow(ActionEvent event) {
        tableBttn.setOnAction(Event -> {
            AlfaApplication.openWindow("Table.fxml");
            Stage stage = (Stage) registerBttn.getScene().getWindow();
            stage.close();
        });
    }

}

