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
public class PartTime extends Volunteer implements Serializable {

    private String pTime;

    public PartTime(String pTime, String fName, String lName, String email, int pNumber) {
        super(fName, lName, email, pNumber);
        this.pTime = pTime;
    }

    public PartTime() {
        super();
        pTime = "";
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "," + pTime;
    }

}
