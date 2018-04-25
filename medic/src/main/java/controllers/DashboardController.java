package controllers;

import observer.IMedicObserver;
import service.MedicClientService;

import java.util.*;

/**
 * 
 */
public class DashboardController implements IMedicObserver {

    @Override
    public void notifyMedic() {

    }

    /**
     * Default constructor
     */
    public DashboardController() {
    }

    /**
     * 
     */
    private MedicClientService medicController;

    /**
     * @param service 
     * @return
     */
    public void setClientService(MedicClientService service) {
        // TODO implement here

    }

    /**
     * @return
     */
    public void completeazaCerere() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void steregeCerere() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void veziStatus() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void veziStatusPacient() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void logout() {
        // TODO implement here

    }

}