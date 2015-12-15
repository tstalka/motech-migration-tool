package org.motechproject.migration.tool.controller;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button migrateButton;

    @FXML
    protected void migrate(ActionEvent event) {
    }

    public void initialize(URL location, ResourceBundle resources) {
        migrateButton.disableProperty().bind(Bindings
                .isEmpty(usernameField.textProperty())
                .or(passwordField.textProperty().isEmpty()));
    }
}
