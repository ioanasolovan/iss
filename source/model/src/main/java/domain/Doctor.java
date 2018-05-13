package domain;

import java.io.Serializable;

public class Doctor implements Serializable
{

    private String username;
    private String password;

    private String nume;
    private String prenume;
    private String cnp;

    public Doctor()
    {
    }

    public Doctor(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public Doctor(String username, String password, String prenume,String nume, String cnp) {
        this.username = username;
        this.password = password;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
    }




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }
}
