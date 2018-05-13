package controllers;

import observer.IDonationObserver;
import service.DoctorClientService;
import domain.Doctor;
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
import service.DoctorClientService;

import java.io.IOException;

/**
 * 
 */
public class AuthenticationController implements IDonationObserver
{



    @FXML
    private TextField usernameLoginText;

    @FXML
    private PasswordField passwordLoginText;

    @FXML
    private TextField usernameSignText;

    @FXML
    private TextField firstnameText;

    @FXML
    private TextField lastnameText;

    @FXML
    private TextField passwordText;

    @FXML
    private TextField cnpText;

    @FXML
    private Button loginButton;

    @FXML
    private Button signupButton;

    /**
     * Default constructor
     */
    public AuthenticationController() {
    }

    /**
     * 
     */
    private DoctorClientService doctorClientService;

    /**
     * @return
     */
    public void login(ActionEvent actionEvent) {
        String username = this.usernameLoginText.getText();
        String password = this.passwordLoginText.getText();
        boolean result = doctorClientService.login(username,password);

        if(!result){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Authentification request");
            alert.setHeaderText("Login failed");
            alert.setContentText("Incorect username/password");
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
            dash.setClientService(doctorClientService);
            dash.setUsername(username);

            Stage primaryStage = new Stage();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);

            primaryStage.show();

            ((Stage)usernameLoginText.getScene().getWindow()).close();
        }


    }


    /**
     * @return
     */

    public void register(ActionEvent actionEvent) {
        String username = usernameSignText.getText();
        String password = passwordText.getText();
        String cnp = cnpText.getText();
        String firstname = firstnameText.getText();
        String lastname = lastnameText.getText();
        boolean result = doctorClientService.register(username, password, firstname, lastname, cnp );
        if(!result){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Authentification request");
            alert.setHeaderText("Register failed");
            alert.setContentText("Incorect fields");
            alert.show();
        }
        else {
            FXMLLoader loader;
            Parent root = null;

            loader = new FXMLLoader(getClass().getResource("/dashboard.fxml"));
            try {
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            DashboardController dash = loader.getController();
            dash.setClientService(doctorClientService);
            dash.setUsername(username);

            Stage primaryStage = new Stage();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);

            primaryStage.show();

            ((Stage)usernameLoginText.getScene().getWindow()).close();
        }
    }

    /**
     * @param service 
     * @return
     */
    public void setClientService(DoctorClientService service) {
        doctorClientService = service;

    }

    @Override
    public void notifyMedic(){


    }

}