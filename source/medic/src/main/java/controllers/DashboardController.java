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
import service.DoctorClientService;

import javax.print.Doc;
import java.io.IOException;

/**
 *
 */
public class DashboardController implements IDonationObserver {


    private DoctorClientService doctorClientService;
    private String username;

    @FXML
    private AnchorPane sidePages;


    public void setClientService(DoctorClientService service) {
        this.doctorClientService= service;
    }


    @Override
    public void notifyMedic() {

    }

    public void completeRequest(MouseEvent mouseEvent) {
        FXMLLoader loader;
        Parent root = null;

        loader = new FXMLLoader(getClass().getResource("/completeRequest.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        CompleteazaCerereController completeazaCerereController = loader.getController();
        completeazaCerereController.setClientService(doctorClientService);
        completeazaCerereController.setUsername(username);

        sidePages.getChildren().clear();
        sidePages.getChildren().addAll(root);

    }


    public void deleteRequest(MouseEvent mouseEvent) {
        FXMLLoader loader;
        Parent root = null;

        loader = new FXMLLoader(getClass().getResource("/deleteRequest.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StergeCerereController stergeCerereController = loader.getController();
        stergeCerereController.setClientService(doctorClientService);
        stergeCerereController.setUsername(username);

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

        VeziStatusController veziStatusController = loader.getController();
        veziStatusController.setClientService(doctorClientService);
        veziStatusController.setUsername(username);

        sidePages.getChildren().clear();
        sidePages.getChildren().addAll(root);

    }


    public void viewStatus(MouseEvent mouseEvent) {
        FXMLLoader loader;
        Parent root = null;

        loader = new FXMLLoader(getClass().getResource("/viewStatus.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        VeziStatusPacientController veziStatusPacientController = loader.getController();
        veziStatusPacientController.setClientService(doctorClientService);
        veziStatusPacientController.setUsername(username);

        sidePages.getChildren().clear();
        sidePages.getChildren().addAll(root);

    }


    public void updateAccount(MouseEvent mouseEvent) {
        FXMLLoader loader;
        Parent root = null;

        loader = new FXMLLoader(getClass().getResource("/update.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        UpdateDataController updateDataController = loader.getController();
        updateDataController.setClientService(doctorClientService);
        updateDataController.setUsername(username);

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

        AuthenticationController lc = loader.getController();
        lc.setClientService(doctorClientService);
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