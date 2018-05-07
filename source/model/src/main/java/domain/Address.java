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

    public Address(Integer id)
    {
        this.id = id;
    }

    public Address()
    {
    }

    @Override
    public String toString()
    {
        return "Address{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", secondaryAddress='" + secondaryAddress + '\'' +
                ", secondaryCity='" + secondaryCity + '\'' +
                ", secondaryCounty='" + secondaryCounty + '\'' +
                '}';
    }

    public Address(String address, String city, String county, String secondaryAddress, String secondaryCity, String secondaryCounty)
    {
        this.address = address;
        this.city = city;
        this.county = county;
        this.secondaryAddress = secondaryAddress;
        this.secondaryCity = secondaryCity;
        this.secondaryCounty = secondaryCounty;
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