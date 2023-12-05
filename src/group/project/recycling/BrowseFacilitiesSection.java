/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling;

/**
 *
 * @author zoheb
 */
public class BrowseFacilitiesSection {
    private final BrowseFacilitiesSectionGUI GUI;
    
    public BrowseFacilitiesSection(){
        // Create GUI
        GUI = new BrowseFacilitiesSectionGUI(this);
        GUI.setVisible(false);
    }
    
    public BrowseFacilitiesSectionGUI getGUI(){
        return GUI;
    }
}
