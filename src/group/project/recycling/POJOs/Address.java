/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling.POJOs;

/**
 *
 * @author zoheb
 */
// POJO to store address data
public class Address {
    public String street;
    public String city;
    public String county;

    // Default constructor for Jackson deserialization
    public Address(){
        
    }
    
    public Address(String street, String city, String county) {
        this.street = street;
        this.city = city;
        this.county = county;
    }
}
