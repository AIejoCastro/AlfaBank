package com.example.seguimiento14;

import com.example.seguimiento14.model.BalanceAmountList;
import com.example.seguimiento14.model.BalanceAmounts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class RegisterController {

    @FXML
    private Button addBillsId;

    @FXML
    private Button addEarningsId;

    @FXML
    private TextField amountText;

    @FXML
    private TextField descrptionText;

    @FXML
    void addBills(ActionEvent event) {
        BalanceAmounts balance = new BalanceAmounts( false,
                Double.parseDouble(amountText.getText()),
                descrptionText.getText(),
                LocalTime.now()
        );
        BalanceAmountList.getInstance().getBalance().add(balance);

        Stage stage = (Stage) addBillsId.getScene().getWindow();
        stage.close();
        AlfaApplication.openWindow("Alfa.fxml");
    }

    @FXML
    void addEarning(ActionEvent event) {
        BalanceAmounts balance = new BalanceAmounts( true,
                Double.parseDouble(amountText.getText()),
                descrptionText.getText(),
                LocalTime.now()
        );
        BalanceAmountList.getInstance().getBalance().add(balance);

        Stage stage = (Stage) addBillsId.getScene().getWindow();
        stage.close();
        AlfaApplication.openWindow("Alfa.fxml");
    }

}
