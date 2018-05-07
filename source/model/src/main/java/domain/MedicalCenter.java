package domain;

import java.io.Serializable;

public class MedicalCenter implements Serializable
{
    private int id;
    private Location location;
    public MedicalCenter()
    {
    }
    public MedicalCenter(int id)
    {
        this.id = id;
    }


    public MedicalCenter(Location location)
    {
        this.location = location;
    }

    public MedicalCenter(int id, Location location)
    {
        this.id = id;
        this.location = location;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }



    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "MedicalCenter{" +
                "id=" + id +
                ", location=" + location +
                '}';
    }
}
