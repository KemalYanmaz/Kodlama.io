package Entities;

import Abstract.IEntity;

import java.util.Date;

public class Customer implements IEntity {
    int id;
    String firstname;
    String lastname;
    Date dateOfBirth;
    int NationalityID;

    public Customer(int id, String firstname, String lastname, Date dateOfBirth, int nationalityID) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        NationalityID = nationalityID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNationalityID() {
        return NationalityID;
    }

    public void setNationalityID(int nationalityID) {
        NationalityID = nationalityID;
    }
}
