package domain;

public class Address {
    private String address;
    private String city;
    private String county;
    private String secondaryAddress;
    private String secondaryCity;
    private String secondaryCounty;

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