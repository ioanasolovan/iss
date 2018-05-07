package domain;

import java.io.Serializable;

public class BloodBag implements Serializable
{
    private int id;
    private String rh;
    private BloodType bloodType;
    private float  thrombocytes;
    private float leukocytes;
    private float redCells;
    private float plasma;
    
    public BloodBag() {
    }

    public BloodBag( String rh, BloodType bloodType, float thrombocytes, float leukocytes, float redCells, float plasma)
    {
        this.rh = rh;
        this.bloodType = bloodType;
        this.thrombocytes = thrombocytes;
        this.leukocytes = leukocytes;
        this.redCells = redCells;
        this.plasma = plasma;
    }

    public BloodBag(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "BloodBag{" +
                "id=" + id +
                ", rh='" + rh + '\'' +
                ", bloodType=" + bloodType +
                ", thrombocytes=" + thrombocytes +
                ", leukocytes=" + leukocytes +
                ", redCells=" + redCells +
                ", plasma=" + plasma +
                '}';
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getRh()
    {
        return rh;
    }

    public void setRh(String rh)
    {
        this.rh = rh;
    }

    public BloodType getBloodType()
    {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType)
    {
        this.bloodType = bloodType;
    }

    public float getThrombocytes()
    {
        return thrombocytes;
    }

    public void setThrombocytes(float thrombocytes)
    {
        this.thrombocytes = thrombocytes;
    }

    public float getLeukocytes()
    {
        return leukocytes;
    }

    public void setLeukocytes(float leukocytes)
    {
        this.leukocytes = leukocytes;
    }

    public float getRedCells()
    {
        return redCells;
    }

    public void setRedCells(float redCells)
    {
        this.redCells = redCells;
    }

    public float getPlasma()
    {
        return plasma;
    }

    public void setPlasma(float plasma)
    {
        this.plasma = plasma;
    }
}