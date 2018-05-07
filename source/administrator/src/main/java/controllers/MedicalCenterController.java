package controllers;

import domain.MedicalCenter;
import observer.IAdministratorObserver;
import service.AdminService;

/**
 * 
 */
public class MedicalCenterController implements IAdministratorObserver
{

    /**
     * Default constructor
     */
    public MedicalCenterController() {
    }

    /**
     * 
     */
    private AdminService service;





    /**
     * @param centru
     */
    public void deleteMedicalCenterTransfuzii(MedicalCenter centru) {
        // TODO implement here
    }

    /**
     * @param centru
     */
    public void updateMedicalCenterTransfuzii(MedicalCenter centru) {
        // TODO implement here
    }

    /**
     * @param centru 
     * @return
     */
    public boolean validareContMedicalCenter(MedicalCenter centru) {
        // TODO implement here
        return false;
    }

    @Override
    public void notifyAdmin() {

    }
}