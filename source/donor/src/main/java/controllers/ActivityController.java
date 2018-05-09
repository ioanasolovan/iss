package controllers;

import domain.DonorRequestForm;
import domain.DonorRequestStatus;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import observer.IDonationObserver;
import service.DonorClientService;

import java.sql.Time;
import java.util.Date;

/**
 * 
 */
public class ActivityController implements IDonationObserver {

    private DonorClientService donorClientService;
    private String username;

    @FXML
    private TableView<DonorRequestForm> table;
    @FXML
    private TableColumn<DonorRequestForm, String> firstname;

    @FXML
    private TableColumn<DonorRequestForm, String> lastname;

    @FXML
    private TableColumn<DonorRequestForm, Date> date;

    @FXML
    private TableColumn<DonorRequestForm, DonorRequestStatus> status;

    private ObservableList<DonorRequestForm> lista = FXCollections.observableArrayList();

    @FXML
    public void initialize() {


        firstname.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastname.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        date.setCellValueFactory((new PropertyValueFactory<>("dateOfRequest")));
        status.setCellValueFactory(new PropertyValueFactory<>("status"));

        table.setItems(lista);


    }

    public void setClientService(DonorClientService service) {
       this.donorClientService = service;
    }

    /**
     * @param date
     */
    public void searchDonationByDate(Date date) {
        // TODO implement here
    }


    @Override
    public void notifyDonor() {

    }

    public void setUsername(String username) {
        this.username = username;
        lista.clear();
        donorClientService.getAllDonorRequests(username).forEach(lista::add);
        }

}