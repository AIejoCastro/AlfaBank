package com.example.seguimiento14;

import com.example.seguimiento14.model.BalanceAmountList;
import com.example.seguimiento14.model.BalanceAmounts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.ResourceBundle;

public class TableController implements Initializable {

    @FXML
    private Button backBttn;

    @FXML
    private TableColumn<BalanceAmounts, Double> balanceAmount;

    @FXML
    private TableColumn<BalanceAmounts, String> balanceDescription;

    @FXML
    private TableColumn<BalanceAmounts, Boolean> balanceEarning;

    @FXML
    private TableColumn<BalanceAmounts, LocalTime> balanceDate;

    @FXML
    private TableView<BalanceAmounts> table;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Collections.sort(BalanceAmountList.getInstance().getBalance(), (a, b) ->{
            return b.getDate().compareTo(a.getDate());
        });

        balanceAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        balanceDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        balanceEarning.setCellValueFactory(new PropertyValueFactory<>("earning"));
        balanceDate.setCellValueFactory(new PropertyValueFactory<>("date"));

        table.setItems(BalanceAmountList.getInstance().getBalance());
    }

    @FXML
    void back(ActionEvent event) {
        Stage stage = (Stage) backBttn.getScene().getWindow();
        stage.close();
        AlfaApplication.openWindow("Alfa.fxml");
    }
}