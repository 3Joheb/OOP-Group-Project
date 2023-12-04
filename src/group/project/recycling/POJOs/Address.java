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
    private String street;
    private String city;
    private String county;

    Address(String street, String city, String county) {
        this.street = street;
        this.city = city;
        this.city = county;
    }
}
