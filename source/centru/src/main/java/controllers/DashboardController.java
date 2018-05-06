package controllers;

import domain.Locatie;
import domain.grupaSangeType;
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

    public void notificaDonatori(grupaSangeType g,  String rh, Locatie locatie) {
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