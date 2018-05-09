package controllers;

import domain.Address;
import domain.DonorRequestForm;
import domain.DonorRequestStatus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import observer.IDonationObserver;
import service.DonorClientService;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

/**
 * 
 */
public class RequestsController implements IDonationObserver {
    private DonorClientService donorClientService;
    private String username;

    @FXML
    private TextField firstnameText;
    @FXML
    private TextField lastnameText;
    @FXML
    private TextField address;
    @FXML
    private TextField city;
    @FXML
    private TextField county;
    @FXML
    private TextField secAddress;
    @FXML
    private TextField secCity;
    @FXML
    private TextField secCounty;
    @FXML
    private TextField emailText;
    @FXML
    private TextField phoneText;

    @FXML
    private DatePicker datePicker;
    @FXML
    private TextArea additionalDataText;



    public RequestsController() {
    }

    public void setClientService(DonorClientService service) {
        this.donorClientService = service;
    }

    public void sendRequest(ActionEvent ae){
        String addressM = address.getText();
        String cityM = city.getText();
        String countyM = county.getText();

        String addressS = secAddress.getText();
        String cityS = secCity.getText();
        String countyS =secCounty.getText();


        Instant instant = Instant.from(datePicker.getValue().atStartOfDay(ZoneId.systemDefault()));
        Date date = Date.from(instant);

        String firstname = firstnameText.getText();
        String lastname = lastnameText.getText();
        String email = emailText.getText();
        String phone = phoneText.getText();
        String addData = additionalDataText.getText();


        Integer id =  donorClientService.saveAddress(addressM,cityM,countyM,addressS,cityS,countyS);
        Address a  = donorClientService.findAddress(id);
        Date currentDate = new Date();
        DonorRequestForm form = new DonorRequestForm(firstname,lastname,username,date,a,email,phone,addData,DonorRequestStatus.PENDING,currentDate);
        donorClientService.saveDonorRequestForm(form);

    }

    @Override
    public void notifyDonor() {

    }

    public void setUsername(String username) {
        this.username = username;
    }
}