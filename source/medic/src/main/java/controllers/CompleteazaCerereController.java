package controllers;

import observer.IMedicObserver;
import service.DoctorClientService;

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
    private DoctorClientService medicController;

    /**
     * @param service
     */
    public void setClientService(DoctorClientService service) {
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