package service;

import domain.Donor;
import domain.DonorRequestForm;
import interfaces.IDonationObserverServer;
import interfaces.IDonationServer;
import observer.IDonationObservable;
import observer.IDonationObserver;

import java.util.*;

/**
 * 
 */
public class DonorClientService implements IDonationObserver, IDonationObservable, IDonationObserverServer {

    /**
     * Default constructor
     */
    public DonorClientService() {
    }

    /**
     * 
     */
    private IDonationServer server;

    /**
     * 
     */
    private Donor user;

    /**
     * @param username 
     * @param password
     */
    public void login(String username, String password) {
        // TODO implement here
    }

    /**
     * @param username 
     * @param password 
     * @param email
     */
    public void register(String username, String password, String email) {
        // TODO implement here
    }

    /**
     * @param user
     */
    public void viewHistory(Donor user) {
        // TODO implement here
    }

    /**
     * @param donorForm
     */
    public void sendForm(DonorRequestForm donorForm) {
        // TODO implement here
    }

    /**
     * @param donor
     */
    public void updatePersonalData(Donor donor) {
        // TODO implement here
    }



    /**
     * @param observer
     */
    public void addObserver(IDonationObserver observer) {
        // TODO implement here
    }

    /**
     * @param observer
     */
    public void removeObserver(IDonationObserver observer) {
        // TODO implement here
    }

    /**
     * 
     */
    public void NotifyObservers() {
        // TODO implement here
    }

    @Override
    public void notifyFromServer() {

    }

    @Override
    public void notifyDonor() {

    }
}