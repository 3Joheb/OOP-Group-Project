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
public class FullTime extends Volunteer implements Serializable {

    private String fTime, experience;
    private double weeklySalary;

    public FullTime(String experience, int weeklySalary, String fTime, String fName, String lName, String email, int pNumber) {
        super(fName, lName, email, pNumber);
        this.fTime = fTime;
        this.weeklySalary = weeklySalary;
        this.experience = experience;
    }

    public FullTime() {
        super();
        fTime = "";
        weeklySalary = 0.0;
        experience = "";
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getfTime() {
        return fTime;
    }

    public void setfTime(String fTime) {
        this.fTime = fTime;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "," + fTime + "," + weeklySalary + "," + experience;
    }

}
