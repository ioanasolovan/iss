package controllers;

import domain.BloodBag;
import observer.ICentruObserver;
import service.CentruClientService;

/**
 * 
 */
public class StocSangeController implements ICentruObserver {

    private CentruClientService centruController;

    /**
     * 
     */
    public void updateStocSange() {
        // TODO implement here
    }

    public void deleteFromStocSange( BloodBag p) {
        // TODO implement here
    }


    public void addStocSange( BloodBag p) {
        // TODO implement here
    }

    /**
     * @param service
     */
    public void setClientService(CentruClientService service) {
        // TODO implement here
    }

    @Override
    public void notifyFromServer() {

    }
}