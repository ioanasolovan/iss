package controllers;

import observer.IAdministratorObserver;
import service.AdminService;

/**
 * 
 */
public class AuthController implements IAdministratorObserver {

    /**
     * Default constructor
     */
    public AuthController() {
    }

    /**
     * 
     */
    private AdminService service;

    /**
     * 
     */
    public void login() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setClientController() {
        // TODO implement here
    }

    @Override
    public void notifyAdmin() {

    }
}