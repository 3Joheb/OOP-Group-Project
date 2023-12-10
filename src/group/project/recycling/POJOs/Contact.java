/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling.POJOs;

/**
 *
 * @author zoheb
 */
// POJO to store contact data
public class Contact {
    public String email;
    public String number;
    
    // Default constructor for Jackson deserialization
    public Contact(){
        
    }
    
    public Contact(String email, String number){
        this.email = email;
        this.number = number;
    }
}
