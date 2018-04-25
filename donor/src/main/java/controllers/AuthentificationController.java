package controllers;

import observer.IDonationObserver;
import service.DonorClientService;

import java.util.*;

/**
 * 
 */
public class AuthentificationController implements IDonationObserver {

    /**
     * Default constructor
     */
    public AuthentificationController() {
    }

    /**
     * 
     */
    private DonorClientService donorController;

    /**
     * 
     */
    public void login() {
        // TODO implement here
    }

    /**
     * 
     */
    public void register() {
        // TODO implement here
    }

    /**
     * @param service
     */
    public void setClientService(DonorClientService service) {
        // TODO implement here
    }

    @Override
    public void notifyDonor() {

    }
}