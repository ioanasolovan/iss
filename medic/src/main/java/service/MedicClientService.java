package service;

import domain.Medic;
import interfaces.IDonationObserverServer;
import interfaces.IDonationServer;
import observer.IMedicObservable;
import observer.IMedicObserver;

import java.util.*;

/**
 * 
 */
public class MedicClientService implements IMedicObservable , IDonationObserverServer {

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
    public MedicClientService() {
    }

    /**
     * 
     */
    private IDonationServer server;

    /**
     * 
     */
    private Medic user;

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