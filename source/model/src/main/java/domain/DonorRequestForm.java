package domain;


import java.io.Serializable;
import java.util.Date;

public class DonorRequestForm implements Serializable
{
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private Date dateOfBird;
    private Address address;
    private String email;
    private String phone;
    private String additionalData;
    private DonorRequestStatus status;
    private Date dateOfRequest;

    public DonorRequestStatus getStatus() {
        return status;
    }

    public void setStatus(DonorRequestStatus status) {
        this.status = status;
    }

    public Date getDateOfRequest() {
        return dateOfRequest;
    }

    public void setDateOfRequest(Date dateOfRequest) {
        this.dateOfRequest = dateOfRequest;
    }

    public DonorRequestForm(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public DonorRequestForm()
    {
    }

    public DonorRequestForm(String firstName, String lastName, String username, Date dateOfBird, Address address, String email, String phone, String additionalData, DonorRequestStatus status, Date dateOfRequest) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.dateOfBird = dateOfBird;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.additionalData = additionalData;
        this.status = status;
        this.dateOfRequest = dateOfRequest;
    }

    @Override
    public String toString()
    {
        return "DonorRequestForm{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", dateOfBird=" + dateOfBird +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", additionalData='" + additionalData + '\'' +
                '}';
    }

    public DonorRequestForm(String email, String phone)
    {
        this.email = email;
        this.phone = phone;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird(Date dateOfBird) {
        this.dateOfBird = dateOfBird;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }
}