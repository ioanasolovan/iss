package domain;

import java.io.Serializable;
import java.time.LocalDate;

public class Donor implements Serializable {
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String email;
    private String phone;
    private boolean firstTimeLogged;
    private String username;
    private String password;

    public Donor(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isFirstTimeLogged() {
        return firstTimeLogged;
    }

    public void setFirstTimeLogged(boolean firstTimeLogged) {
        this.firstTimeLogged = firstTimeLogged;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasssord() {
        return password;
    }

    public void setPasssord(String password) {
        this.password = password;
    }
}