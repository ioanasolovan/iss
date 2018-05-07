package service;

import domain.Donor;
import domain.DonorRequestForm;
import observer.IDonationObservable;
import observer.IDonationObserver;
import services.IDonationObserverServer;
import services.IDonationServer;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 */
public class DonorClientService extends UnicastRemoteObject implements IDonationObservable, IDonationObserverServer,Serializable {
    private IDonationServer server;
    private Donor user;


    public DonorClientService(IDonationServer server)  throws RemoteException {
        this.server = server;
    }

    public boolean login(String username, String password) {
        Donor donor = new Donor(username,password);
        return server.login(donor , this);
    }

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

    @Override
    public void addObserver(IDonationObserver observer) {

    }

    @Override
    public void removeObserver(IDonationObserver observer) {

    }

    @Override
    public void NotifyObservers() {

    }

    @Override
    public void notifyFromServer() {

    }
}