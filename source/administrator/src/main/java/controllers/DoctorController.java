package controllers;

import domain.Doctor;
import observer.IAdministratorObserver;
import service.AdminService;

/**
 * 
 */
public class DoctorController implements IAdministratorObserver {

    /**
     * Default constructor
     */
    public DoctorController() {
    }

    /**
     * 
     */
    public AdminService service;


    public DoctorController(AdminService service)
    {
        this.service = service;
    }

    /**
     * @param medic
     */
    public void deleteDoctor(Doctor medic) {
        // TODO implement here
    }

    /**
     * @param medic
     */
    public void updateDoctor(Doctor medic) {
        // TODO implement here
    }

    /**
     * @param medic 
     * @return
     */
    public boolean validareConDoctor(Doctor medic) {
        // TODO implement here
        return false;
    }

    @Override
    public void notifyAdmin() {

    }
}