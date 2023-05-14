package com.example.seguimiento14.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BalanceAmountList {

    private ObservableList<BalanceAmounts> contacts = FXCollections.observableArrayList();

    //Constructor privado
    public ObservableList<BalanceAmounts> getBalance() {
        return contacts;
    }

    public void setBalance(ObservableList<BalanceAmounts> contacts) {
        this.contacts = contacts;
    }

    private BalanceAmountList(){}

    private static BalanceAmountList instance = null;

    public static BalanceAmountList getInstance(){
        if(instance == null){
            instance = new BalanceAmountList();
        }
        return instance;
    }
}
