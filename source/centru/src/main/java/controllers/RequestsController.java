package controllers;

import observer.ICentruObserver;
import service.CentruClientService;

/**
 * 
 */
public class RequestsController implements ICentruObserver {

    /**
     * Default constructor
     */
    public RequestsController() {
    }

    /**
     * 
     */
    private CentruClientService centruService;

    /**
     * 
     */
    public void sendRequest() {
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