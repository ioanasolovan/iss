package controllers;

import observer.IMedicObserver;
import service.DoctorClientService;

/**
 * 
 */
public class VeziStatusController implements IMedicObserver {

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
}