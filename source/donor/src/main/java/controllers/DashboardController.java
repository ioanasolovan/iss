package controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import observer.IDonationObserver;
import service.DonorClientService;

import java.io.IOException;

/**
 * 
 */
public class DashboardController implements IDonationObserver {


    private DonorClientService donorClientService;
    private String username;

    @FXML
    private AnchorPane sidePages;


    public void setClientService(DonorClientService service) {
        this.donorClientService= service;
    }


    @Override
    public void notifyDonor() {

    }

    public void donate(MouseEvent mouseEvent) {
        FXMLLoader loader;
        Parent root = null;

        loader = new FXMLLoader(getClass().getResource("/donate.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        RequestsController donateController = loader.getController();
        donateController.setClientService(donorClientService);
        donateController.setUsername(username);

        sidePages.getChildren().clear();
        sidePages.getChildren().addAll(root);

    }


    public void update(MouseEvent mouseEvent) {
        FXMLLoader loader;
        Parent root = null;

        loader = new FXMLLoader(getClass().getResource("/update.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        UpdatePersonalDataController register = loader.getController();
        register.setClientService(donorClientService);

        sidePages.getChildren().clear();
        sidePages.getChildren().addAll(root);
    }


    public void history(MouseEvent mouseEvent) {
        FXMLLoader loader;
        Parent root = null;

        loader = new FXMLLoader(getClass().getResource("/history.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ActivityController historyController = loader.getController();
        historyController.setClientService(donorClientService);
        historyController.setUsername(username);

        sidePages.getChildren().clear();
        sidePages.getChildren().addAll(root);

    }

    public void logout(MouseEvent mouseEvent) {
        FXMLLoader loader;
        Parent root = null;

        loader = new FXMLLoader(getClass().getResource("/auth.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        AuthentificationController lc = loader.getController();
        lc.setClientService(donorClientService);
        Stage primaryStage = new Stage();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        ((Stage)sidePages.getScene().getWindow()).close();
        primaryStage.show();

    }


    public void setUsername(String username) {
        this.username = username;
    }
}