package controllers;

import domain.Punga;
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

    public void deleteFromStocSange( Punga p) {
        // TODO implement here
    }


    public void addStocSange( Punga p) {
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