package controllers;

import observer.IDonationObserver;
import service.DoctorClientService;

/**
 * 
 */
public class StergeCerereController implements IDonationObserver {

    private String username;
    /**
     * Default constructor
     */
    public StergeCerereController() {
    }

    /**
     * 
     */
    private DoctorClientService medicController;

    /**
     * @param service 
     * @return
     */
    public void setClientService(DoctorClientService service) {
        // TODO implement here

    }

    /**
     * @return
     */
    public void stergeCerere() {
        // TODO implement here

    }

    @Override
    public void notifyMedic() {

    }

    public void setUsername(String username) {
        this.username = username;
    }

}