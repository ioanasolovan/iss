package controllers;

import observer.IDonationObserver;
import service.DonorClientService;

import java.util.*;

/**
 * 
 */
public class ActivityController implements IDonationObserver {

    /**
     * Default constructor
     */
    public ActivityController() {
    }

    /**
     * 
     */
    private DonorClientService donorController;

    public void setClientService(DonorClientService service) {
        // TODO implement here
    }

    /**
     * @param date
     */
    public void searchDonationByDate(Date date) {
        // TODO implement here
    }


    @Override
    public void notifyDonor() {

    }
}