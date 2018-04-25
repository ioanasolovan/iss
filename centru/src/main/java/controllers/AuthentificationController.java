package controllers;

import observer.ICentruObserver;
import service.CentruClientService;

import java.util.*;

/**
 * 
 */
public class AuthentificationController implements ICentruObserver {

    /**
     * Default constructor
     */
    public AuthentificationController() {
    }

    /**
     * 
     */
    private CentruClientService centruService;

    /**
     * 
     */
    public void logIn() {
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