package domain;

import java.io.Serializable;

public class Patient implements Serializable
{
    private Integer id;
    private String firstName;
    private String lastName;
    private String cnp;

    public Patient()
    {
    }

    public Patient(Integer id)
    {
        this.id = id;
    }

    public Patient( String firstName, String lastName, String cnp)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getCnp()
    {
        return cnp;
    }

    public void setCnp(String cnp)
    {
        this.cnp = cnp;
    }

    @Override
    public String toString()
    {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }
}