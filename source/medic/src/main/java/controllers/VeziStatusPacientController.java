package controllers;

import observer.IDonationObserver;
import service.DoctorClientService;

/**
 * 
 */
public class VeziStatusPacientController implements IDonationObserver {

    private String username;
    /**
     * Default constructor
     */
    public VeziStatusPacientController() {
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
    public void veziStatusPacient() {
        // TODO implement here

    }

    @Override
    public void notifyMedic() {

    }
    public void setUsername(String username) {
        this.username = username;
    }

}