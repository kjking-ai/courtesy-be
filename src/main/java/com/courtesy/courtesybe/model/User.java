package com.courtesy.courtesybe.model;

import javax.persistence.*;

@Entity
//@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // @Column(name = "first_name")

    private String fName;

    // @Column(name = "last_name")
    private String lName;

    public User() {

    }

    public User (String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
