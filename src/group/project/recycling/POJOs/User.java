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
public class User {
    public String name;
    public Contact contact;
    public Address address;
    public Integer payment;
    
    // Default constructor for Jackson deserialization
    // Jackson requires an empty constructor
    // This is important to map objects onto a dev defined class and not something like JsonNode
    public User(){
        
    }
    
    public User(String name, Contact contact, Address address, Integer payment){
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.payment = payment;
    }
}
