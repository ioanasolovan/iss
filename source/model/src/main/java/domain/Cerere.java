package domain;

/**
 * 
 */
public class Cerere {
    private int id;
    private int idPacient;
    private grupaSangeType grupaSange;
    private String RH;
    private gradUrgentaType gradUrgenta;
    private Locatie locatiePacient;
    private int idMedic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPacient() {
        return idPacient;
    }

    public void setIdPacient(int idPacient) {
        this.idPacient = idPacient;
    }

    public grupaSangeType getGrupaSange() {
        return grupaSange;
    }

    public void setGrupaSange(grupaSangeType grupaSange) {
        this.grupaSange = grupaSange;
    }

    public String getRH() {
        return RH;
    }

    public void setRH(String RH) {
        this.RH = RH;
    }

    public gradUrgentaType getGradUrgenta() {
        return gradUrgenta;
    }

    public void setGradUrgenta(gradUrgentaType gradUrgenta) {
        this.gradUrgenta = gradUrgenta;
    }

    public Locatie getLocatiePacient() {
        return locatiePacient;
    }

    public void setLocatiePacient(Locatie locatiePacient) {
        this.locatiePacient = locatiePacient;
    }

    public int getIdMedic() {
        return idMedic;
    }

    public void setIdMedic(int idMedic) {
        this.idMedic = idMedic;
    }
}