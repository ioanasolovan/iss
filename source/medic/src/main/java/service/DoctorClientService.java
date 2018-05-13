package service;

import domain.Doctor;
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
public class DoctorClientService extends UnicastRemoteObject implements IDonationObservable, IDonationObserverServer, Serializable {
    private IDonationServer server;

    private Doctor user;


    @Override
    public void notifyFromServer() {

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


    public DoctorClientService(IDonationServer server) throws RemoteException {
        this.server = server;
    }



    public boolean login(String username, String password) {
        Doctor doctor = new Doctor(username, password);
        return server.login(doctor, this);
    }


    public boolean register(String username, String password, String firstName, String lastName, String cnp) {
        Doctor doctor = new Doctor(username, password, firstName, lastName, cnp);
        return server.register(doctor);

    }

    public void completeazaCerere() {
        // TODO implement here

    }


    public void stergeCerere(int idCerere) {
        // TODO implement here

    }


    public void veziStatus(int idMedic) {
        // TODO implement here

    }


    public void veziStatusPacient(int idPacient) {
        // TODO implement here

    }

}