package service;

import domain.Administrator;
import domain.Centru;
import domain.Medic;
import observer.IAdminObservable;
import observer.IAdministratorObserver;
import services.IDonationObserverServer;
import services.IDonationServer;

/**
 * 
 */
public class AdminService implements IDonationObserverServer, IAdminObservable {

    /**
     * Default constructor
     */
    public AdminService() {
    }

    /**
     * 
     */
    private IDonationServer server;

    /**
     * 
     */
    private Administrator user;



    /**
     * @param username 
     * @param password
     */
    public void login(String username, String password) {
        // TODO implement here
    }

    /**
     * @param medic
     */
    public void validareContMedic(Medic medic) {
        // TODO implement here
    }

    /**
     * @param medic
     */
    public void deleteMedic(Medic medic) {
        // TODO implement here
    }

    /**
     * @param medic
     */
    public void updateMedic(Medic medic) {
        // TODO implement here
    }

    /**
     * @param centru
     */
    public void validateContCentru(Centru centru) {
        // TODO implement here
    }

    /**
     * @param centru
     */
    public void deleteCentru(Centru centru) {
        // TODO implement here
    }

    /**
     * @param centru
     */
    public void updateCentru(Centru centru) {
        // TODO implement here
    }



    @Override
    public void addObserver(IAdministratorObserver observer) {

    }

    @Override
    public void removeObserver(IAdministratorObserver observer) {

    }

    @Override
    public void notifyObservers() {

    }


    @Override
    public void notifyFromServer() {

    }
}