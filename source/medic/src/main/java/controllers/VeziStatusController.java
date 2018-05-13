package controllers;

import observer.IDonationObserver;
import service.DoctorClientService;

/**
 * 
 */
public class VeziStatusController implements IDonationObserver {
    private String username;
    /**
     * Default constructor
     */
    public VeziStatusController() {
    }

    /**
     * 
     */
    private DoctorClientService medicController;

    /**
     * @param service
     */
    public void setClientService(DoctorClientService service) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void veziStatus() {
        // TODO implement here

    }

    @Override
    public void notifyMedic() {

    }
    public void setUsername(String username) {
        this.username = username;
    }


}