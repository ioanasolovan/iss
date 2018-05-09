package controllers;

import domain.Donor;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import observer.IDonationObserver;
import service.DonorClientService;

import java.io.IOException;

/**
 *
 */
public class AuthentificationController implements IDonationObserver {
    private DonorClientService donorClientService;

    @FXML
    private TextField usernameLoginText;

    @FXML
    private TextField passwordLoginText;

    @FXML
    private TextField usernameSignText;

    @FXML
    private TextField firstnameText;

    @FXML
    private TextField lastnameText;

    @FXML
    private TextField passwordText;

    @FXML
    private TextField emailText;

    @FXML
    private Button loginButton;

    @FXML
    private Button signupButton;


    public void setClientService(DonorClientService service) {
        donorClientService = service;
    }


    @Override
    public void notifyDonor() {

    }

    public void login(ActionEvent actionEvent) {
        String username = this.usernameLoginText.getText();
        String password = this.passwordLoginText.getText();
        boolean result = donorClientService.login(username, password);

        if (!result) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Authentification request");
            alert.setHeaderText("Login failed");
            alert.setContentText("Incorect username / password");
            alert.show();
        } else {


            FXMLLoader loader;
            Parent root = null;

            loader = new FXMLLoader(getClass().getResource("/dashboard.fxml"));
            try {
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            DashboardController dash = loader.getController();
            dash.setClientService(donorClientService);
            dash.setUsername(username);

            Stage primaryStage = new Stage();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);

            primaryStage.show();

            ((Stage)usernameLoginText.getScene().getWindow()).close();
        }

    }

    public void register(ActionEvent actionEvent) {
        String username = usernameSignText.getText();
        String password = passwordText.getText();
        String email = emailText.getText();
        String firstname = firstnameText.getText();
        String lastname = lastnameText.getText();
        Donor donor = new Donor(username, firstname, lastname, null, email, null, true, password, null);

        FXMLLoader loader;
        Parent root = null;

        loader = new FXMLLoader(getClass().getResource("/register.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        RegisterController register = loader.getController();
        register.setClientService(donorClientService);
        register.setDonor(donor);

        Stage primaryStage = new Stage();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.show();


    }

    public void logout(ActionEvent actionEvent) {



    }
}