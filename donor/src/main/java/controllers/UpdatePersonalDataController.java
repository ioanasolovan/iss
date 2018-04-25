package controllers;

import observer.IDonationObserver;
import service.DonorClientService;

import java.util.*;

/**
 * 
 */
public class UpdatePersonalDataController implements IDonationObserver {

    /**
     * Default constructor
     */
    public UpdatePersonalDataController() {
    }

    /**
     * 
     */
    private DonorClientService donorController;

    /**
     * 
     */
    public void updateData() {
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