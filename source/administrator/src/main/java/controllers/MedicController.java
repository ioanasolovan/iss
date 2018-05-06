package controllers;

import domain.Medic;
import observer.IAdministratorObserver;
import service.AdminService;

/**
 * 
 */
public class MedicController implements IAdministratorObserver {

    /**
     * Default constructor
     */
    public MedicController() {
    }

    /**
     * 
     */
    public AdminService service;




    /**
     * @param medic
     */
    public void deleteMedic(Medic medic) {
        // TODO implement here
    }

    /**
     * @param medic
     */
    public void updateMedic(Medic medic) {
        // TODO implement here
    }

    /**
     * @param medic 
     * @return
     */
    public boolean validareConMedic(Medic medic) {
        // TODO implement here
        return false;
    }

    @Override
    public void notifyAdmin() {

    }
}