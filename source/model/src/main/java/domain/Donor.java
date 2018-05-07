package domain;

import java.io.Serializable;
import java.util.Date;

public class Donor implements Serializable
{
    private String username;
    private String firstname;
    private String lastname;
    private Date dateOfBirth;
    private String email;
    private String phone;
    private Boolean firstTimeLogged;
    private String password;
    private Address address;

    public Boolean getFirstTimeLogged()
    {
        return firstTimeLogged;
    }

    public void setFirstTimeLogged(Boolean firstTimeLogged)
    {
        this.firstTimeLogged = firstTimeLogged;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }



    public Donor()
    {
    }

    public Donor(String username, String firstname, String lastname, Date dateOfBirth, String email, String phone, Boolean firstTimeLogged, String password, Address address)
    {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
        this.firstTimeLogged = firstTimeLogged;
        this.password = password;
        this.address=address;
    }

    public Donor(String username)
    {
        this.username = username;
    }

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
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


    public void setFirstTimeLogged(boolean firstTimeLogged) {
        this.firstTimeLogged = firstTimeLogged;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString()
    {
        return "Donor{" +
                "username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", firstTimeLogged=" + firstTimeLogged +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}