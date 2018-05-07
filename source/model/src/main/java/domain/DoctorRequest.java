package domain;

import java.io.Serializable;

/**
 * 
 */
public class DoctorRequest implements Serializable
{
    private int id;

    public EmergencyLevelType getEmergencyLevel()
    {
        return emergencyLevel;
    }

    public void setEmergencyLevel(EmergencyLevelType emergencyLevel)
    {
        this.emergencyLevel = emergencyLevel;
    }

    private Patient patient;
    private BloodType bloodType;
    private String RH;
    private EmergencyLevelType emergencyLevel;
    private Location locationPatient;
    private Doctor doctor;

    public DoctorRequest(int id)
    {
        this.id = id;
    }

    public DoctorRequest()
    {
    }


    public DoctorRequest(Patient idPacient, BloodType bloodType, String RH, EmergencyLevelType emergencyLevel, Location locationPatient, Doctor doctor)
    {
        this.patient =idPacient;
        this.bloodType = bloodType;
        this.RH = RH;
        this.emergencyLevel = emergencyLevel;
        this.locationPatient = locationPatient;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public String getRH() {
        return RH;
    }

    public void setRH(String RH) {
        this.RH = RH;
    }

    public EmergencyLevelType getGradUrgenta() {
        return emergencyLevel;
    }

    public void setGradUrgenta(EmergencyLevelType gradUrgenta) {
        this.emergencyLevel = gradUrgenta;
    }

    public Location getLocationPatient() {
        return locationPatient;
    }

    public void setLocationPatient(Location locationPatient) {
        this.locationPatient = locationPatient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString()
    {
        return "DoctorRequest{" +
                "id=" + id +
                ", idPatient=" + patient +
                ", bloodType=" + bloodType +
                ", RH='" + RH + '\'' +
                ", emergencyLevel=" + emergencyLevel +
                ", locationPatient=" + locationPatient +
                ", idDoctor=" + doctor +
                '}';
    }
}