package services;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 
 */
public interface IDonationObserverServer extends Remote {

    /**
     * 
     */
    public void notifyFromServer() throws RemoteException;

}