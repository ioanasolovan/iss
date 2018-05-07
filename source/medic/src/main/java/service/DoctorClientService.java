package service;

import domain.Doctor;
import observer.IMedicObservable;
import observer.IMedicObserver;
import services.IDonationObserverServer;
import services.IDonationServer;

/**
 * 
 */
public class DoctorClientService implements IMedicObservable , IDonationObserverServer {

    @Override
    public void notifyFromServer() {

    }

    @Override
    public void addObserver(IMedicObserver observer) {

    }

    @Override
    public void removeObserver(IMedicObserver observer) {

    }

    @Override
    public void notifyObservers() {

    }

    /**
     * Default constructor
     */
    public DoctorClientService() {
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
     * @return
     */
    public void login(String username, String password) {
        // TODO implement here
          }

    /**
     * @param username 
     * @param password 
     * @return
     */
    public void register(String username, String password) {
        // TODO implement here

    }

    /**
     * @return
     */
    public void completeazaCerere() {
        // TODO implement here

    }

    /**
     * @param idCerere 
     * @return
     */
    public void stergeCerere(int idCerere) {
        // TODO implement here

    }

    /**
     * @param idMedic 
     * @return
     */
    public void veziStatus(int idMedic) {
        // TODO implement here

    }

    /**
     * @param idPacient 
     * @return
     */
    public void veziStatusPacient(int idPacient) {
        // TODO implement here

    }

}