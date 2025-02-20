 
package com.doctorrv.model;

public class Patient {
    private int id;
    private String username;
    private String email;
    private String telephone;
    private String password;

    // Constructor
    public Patient(int id, String username, String email, String telephone, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    // Getters (to get data)
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getPassword() {
        return password;
    }

    // Setters (to update data)
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
