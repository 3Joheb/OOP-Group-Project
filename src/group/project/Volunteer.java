/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project;

import java.io.Serializable;

/**
 *
 * @author Matty School
 */
public abstract class Volunteer implements Serializable {

    private String fName, lName, email;
    private int pNumber;

    public Volunteer() {
        fName = "";
        lName = "";
        email = "";
        pNumber = 0;
    }

    public Volunteer(String fName, String lName, String email, int pNumber) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.pNumber = pNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getpNumber() {
        return pNumber;
    }

    public void setpNumber(int pNumber) {
        this.pNumber = pNumber;
    }

    public String getDetails() {
        return "Volunteer Details: " + fName + "," + lName + "," + email + "," + pNumber;
    }

}
