package controllers;

import domain.Doctor;
import observer.IDonationObserver;
import service.DoctorClientService;

import javax.print.Doc;

/**
 *
 */
public class UpdateDataController implements IDonationObserver {

    private String username;
    /**
     * Default constructor
     */
    public UpdateDataController() {
    }

    /**
     *
     */
    private DoctorClientService doctorController;

    /**
     *
     */
    public void updateData() {
        // TODO implement here
    }

    /**
     * @param service
     */
    public void setClientService(DoctorClientService service) {
        // TODO implement here
    }

    @Override
    public void notifyMedic() {

    }
    public void setUsername(String username) {
        this.username = username;
    }

}