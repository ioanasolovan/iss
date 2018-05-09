package controllers;

import javafx.scene.input.MouseEvent;
import observer.IAdministratorObserver;
import service.AdminService;

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