package controllers;

import domain.Centru;
import observer.IAdministratorObserver;
import service.AdminService;

import java.util.*;

/**
 * 
 */
public class CentruTrasfuziiController implements IAdministratorObserver {

    /**
     * Default constructor
     */
    public CentruTrasfuziiController() {
    }

    /**
     * 
     */
    private AdminService service;





    /**
     * @param centru
     */
    public void deleteCentruTransfuzii(Centru centru) {
        // TODO implement here
    }

    /**
     * @param centru
     */
    public void updateCentruTransfuzii(Centru centru) {
        // TODO implement here
    }

    /**
     * @param centru 
     * @return
     */
    public boolean validareContCentru(Centru centru) {
        // TODO implement here
        return false;
    }

    @Override
    public void notifyAdmin() {

    }
}