package controllers;

import observer.IMedicObserver;
import service.MedicClientService;

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
    private MedicClientService medicController;

    /**
     * @param service
     */
    public void setClientService(MedicClientService service) {
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