/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling.POJOs;

/**
 *
 * @author zoheb
 */
// POJO to store user input on depot section
public class DepotInput {
    private String name;
    private Contact contact;
    private Address address;
    private Integer payment;
    
    DepotInput(String name, Contact contact, Address address, Integer payment){
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.payment = payment;
    }
}
