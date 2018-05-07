package controllers;

import domain.BloodType;
import domain.Location;
import observer.ICentruObserver;
import service.CentruClientService;

/**
 * 
 */
public class DashboardController implements ICentruObserver {

    /**
     * Default constructor
     */
    public DashboardController() {
    }

    /**
     * 
     */
    private CentruClientService centruService;

    /**
     * @param service
     */
    public void setClientService(CentruClientService service) {
        // TODO implement here
    }


    public void valideazaDonator() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void getDonatori() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void getPacienti() {
        // TODO implement here

    }

    public void notificaDonatori(BloodType g, String rh, Location locatie) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void decideIntrePacienti() {
        // TODO implement here

    }

    @Override
    public void notifyFromServer() {

    }
}