package controllers;

import observer.IAdministratorObserver;
import service.AdminService;

import java.util.*;

/**
 * 
 */
public class DashboardController implements IAdministratorObserver {

    /**
     * Default constructor
     */
    public DashboardController() {
    }

    /**
     * 
     */
    private AdminService service;



    /**
     * 
     */
    public void setClientController() {
        // TODO implement here
    }

    /**
     * 
     */
    public void logout() {
        // TODO implement here
    }

    @Override
    public void notifyAdmin() {

    }
}