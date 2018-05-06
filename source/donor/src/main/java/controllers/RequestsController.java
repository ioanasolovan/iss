package controllers;

import observer.IDonationObserver;
import service.DonorClientService;

/**
 * 
 */
public class RequestsController implements IDonationObserver {

    /**
     * Default constructor
     */
    public RequestsController() {
    }

    /**
     * 
     */
    private DonorClientService donorController;

    /**
     * @param service
     */
    public void setClientService(DonorClientService service) {
        // TODO implement here
    }

    /**
     * 
     */
    public void sendRequest() {
        // TODO implement here
    }

    /**
     * 
     */
    public void abortRequest() {
        // TODO implement here
    }

    @Override
    public void notifyDonor() {

    }
}