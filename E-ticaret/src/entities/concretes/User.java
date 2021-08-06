package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User(int id, String firstName, String lastName, String email, String password) throws Exception {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;

        if(firstName.isEmpty()||lastName.isEmpty()||email.isEmpty()||password.isEmpty()){
            throw new Exception("Fill all fields.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return firstName+ " "+lastName;
    }
}
