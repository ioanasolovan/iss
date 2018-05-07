package service;

import domain.*;
import services.IDonationServer;

import java.util.List;

/**
 * 
 */
public class CentruClientService {

    /**
     * Default constructor
     */
    public CentruClientService() {
    }

    /**
     * 
     */
    private IDonationServer server;

    /**
     * 
     */
    private Doctor user;

    /**
     * @param username 
     * @param password
     */
    public void login(String username, String password) {
        // TODO implement here
    }

    public boolean valideazaDonator(Donor d) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public List<Donor> getDonatori() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Patient> getPatienti() {
        // TODO implement here
        return null;
    }


    public void notificaDonatori(BloodBag g, String rh) {
        // TODO implement here
    }


    public Patient decideIntrePatienti() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void updateStocSange() {
        // TODO implement here
    }


    public void deleteFromStocSange( BloodBag p) {
        // TODO implement here
    }

    public void addStocSange(BloodBag p) {
        // TODO implement here
    }

}