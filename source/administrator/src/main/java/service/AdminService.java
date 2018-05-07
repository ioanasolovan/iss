package service;

import domain.Administrator;
import domain.Doctor;
import domain.MedicalCenter;
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
    public void validareContDoctor(Doctor medic) {
        // TODO implement here
    }

    /**
     * @param medic
     */
    public void deleteDoctor(Doctor medic) {
        // TODO implement here
    }

    /**
     * @param medic
     */
    public void updateDoctor(Doctor medic) {
        // TODO implement here
    }

    /**
     * @param centru
     */
    public void validateContMedicalCenter(MedicalCenter centru) {
        // TODO implement here
    }

    /**
     * @param centru
     */
    public void deleteMedicalCenter(MedicalCenter centru) {
        // TODO implement here
    }

    /**
     * @param centru
     */
    public void updateMedicalCenter(MedicalCenter centru) {
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