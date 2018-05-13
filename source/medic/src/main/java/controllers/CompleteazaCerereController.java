package controllers;

import observer.IDonationObserver;
import service.DoctorClientService;

/**
 * 
 */
public class CompleteazaCerereController implements IDonationObserver {

    private String username;
    /**
     * Default constructor
     */
    public CompleteazaCerereController() {
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

    @Override
    public void notifyMedic() {

    }

    /**
     * @return
     */
    public void trimitereCerere() {
        // TODO implement here

    }

    public void setUsername(String username) {
        this.username = username;
    }


}