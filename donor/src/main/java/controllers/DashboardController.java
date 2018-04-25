package controllers;

import observer.IDonationObserver;
import service.DonorClientService;

import java.util.*;

/**
 * 
 */
public class DashboardController implements IDonationObserver {

    /**
     * Default constructor
     */
    public DashboardController() {
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
    public void makeRequestForm() {
        // TODO implement here
    }

    /**
     * 
     */
    public void seeHistory() {
        // TODO implement here
    }

    /**
     * 
     */
    public void logout() {
        // TODO implement here
    }

    @Override
    public void notifyDonor() {

    }
}