/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project;

/**
 *
 * @author Matty School
 */
public class Donate {

    private String cardNum, name, expiry;
    private int cvc;
    private double amount;

    public Donate() {
        cardNum = " ";
        name = "";
        expiry = "";
        cvc = 0;
        amount = 0.0;
    }

    public Donate(String cardNum, String name, String expiry, int cvc, double amount) {
        this.cardNum = cardNum;
        this.name = name;
        this.expiry = expiry;
        this.cvc = cvc;
        this.amount = amount;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDetails() {
        return "Volunteer Details: " + cardNum + "," + name + "," + expiry + "," + cvc + "," + amount;
    }

}
