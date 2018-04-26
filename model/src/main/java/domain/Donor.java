package domain;

import java.time.LocalDate;

public class Donor {
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String email;
    private String phone;
    private boolean firstTimeLogged;
    private Address address;
    private String username;
    private String passsord;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasssord() {
        return passsord;
    }

    public void setPasssord(String passsord) {
        this.passsord = passsord;
    }
}