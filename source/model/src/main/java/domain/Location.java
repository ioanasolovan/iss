package domain;

import java.io.Serializable;

public class Location implements Serializable
{

    public Location() { }

    private int id;
    private String address;

    private String city;

    private String county;

    public Location(String address, String city, String county)
    {
        this.address = address;
        this.city = city;
        this.county = county;
    }

    public Location(int id)
    {
        this.id = id;
    }

    public String getAddress()
    {
        return address;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCounty()
    {
        return county;
    }

    public void setCounty(String county)
    {
        this.county = county;
    }

    @Override
    public String toString()
    {
        return "Location{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}