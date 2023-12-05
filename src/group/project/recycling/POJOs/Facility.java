/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling.POJOs;

import java.util.List;

/**
 *
 * @author zoheb
 */
// Facility POJO
public class Facility {
    private String company_name;
    private String facility_name;
    private Contact contact;
    private Address address;
    private Time time;
    private List<String> accepted_waste;
    private String image_path;
    
    // Jackson deserialization constructor
    public Facility(){
        
    }
    
    public Facility(String companyName, String facilityName, Contact contact, Address address, Time time, List<String> waste, String imagePath){
        company_name = companyName;
        facility_name = facilityName;
        this.contact = contact;
        this.address = address;
        this.time = time;
        accepted_waste = waste;
        image_path = imagePath;
    }
}
