package controllers;

import domain.Address;
import domain.Donor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import service.DonorClientService;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class RegisterController {
    private DonorClientService donorClientService;
    private Donor donor;

    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField phone;

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
    private Button finishButton;

    @FXML
    private Button abortButton;




    public void setClientService(DonorClientService service) {
        donorClientService = service;
    }

    public void register(ActionEvent actionEvent) {
        String addressM = address.getText();
        String cityM = city.getText();
        String countyM = city.getText();
        String addressS = secAddress.getText();
        String cityS = secCity.getText();
        String countyS = secCounty.getText();

        //Date date =datePicker.getValue().;
        Instant instant = Instant.from(datePicker.getValue().atStartOfDay(ZoneId.systemDefault()));
        Date date = Date.from(instant);
        donor.setDateOfBirth(date);

        String phoneD = phone.getText();
        donor.setPhone(phoneD);



       Integer id =  donorClientService.saveAddress(addressM,cityM,countyM,addressS,cityS,countyS);
        Address a  = donorClientService.findAddress(id);
        donor.setAddress(a);
        donorClientService.saveDonor(donor);
    }

    public void abort(ActionEvent actionEvent) {

    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }
}
