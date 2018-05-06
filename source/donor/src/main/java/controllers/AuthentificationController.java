package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import observer.IDonationObserver;
import service.DonorClientService;

/**
 * 
 */
public class AuthentificationController implements IDonationObserver {
    private DonorClientService donorClientService;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;




    public void setClientService(DonorClientService service) {
        donorClientService = service;
    }


    public void loginHandler(ActionEvent actionEvent) {
        String username = usernameField.getText();
        String password = passwordField.getText();

       boolean result =  donorClientService.login(username,password);

    }




    @Override
    public void notifyDonor() {

    }

}