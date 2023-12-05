/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling.POJOs;

/**
 *
 * @author zoheb
 */
public class Time {
    private String opening;
    private String closing;
    
    // Jackson empty constructor for deserialization
    public Time(){
        
    }
    
    public Time(String opening, String closing){
        this.opening = opening;
        this.closing = closing;
    }
}
