package controllers;

import observer.IMedicObserver;
import service.MedicClientService;

/**
 * 
 */
public class CompleteazaCerereController implements IMedicObserver {

    /**
     * Default constructor
     */
    public CompleteazaCerereController() {
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

    @Override
    public void notifyMedic() {

    }

    /**
     * @return
     */
    public void trimitereCerere() {
        // TODO implement here

    }

}