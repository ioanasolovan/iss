package domain;

import java.io.Serializable;

public class Address implements Serializable {
    private Integer id;
    private String address;
    private String city;
    private String county;
    private String secondaryAddress;
    private String secondaryCity;
    private String secondaryCounty;
    private Donor donor;

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getSecondaryAddress() {
        return secondaryAddress;
    }

    public void setSecondaryAddress(String secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }

    public String getSecondaryCity() {
        return secondaryCity;
    }

    public void setSecondaryCity(String secondaryCity) {
        this.secondaryCity = secondaryCity;
    }

    public String getSecondaryCounty() {
        return secondaryCounty;
    }

    public void setSecondaryCounty(String secondaryCounty) {
        this.secondaryCounty = secondaryCounty;
    }
}