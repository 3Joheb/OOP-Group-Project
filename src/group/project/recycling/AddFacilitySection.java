/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling;

/**
 *
 * @author zoheb
 */
public class AddFacilitySection {
    // Save GUI instance
    private AddFacilitySectionGUI GUI;
    
    public AddFacilitySection(){
        GUI = new AddFacilitySectionGUI(this);
        GUI.setVisible(false);
    }
    
    public AddFacilitySectionGUI getGUI(){
        return GUI;
    }
}
