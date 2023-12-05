/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling;

/**
 *
 * @author zoheb
 */
// Recycling section entry file
public class Recycling {

    public void initSection() {
        // Add depots section //
        DepotsSection depots = new DepotsSection();

        // Add browse section //
        BrowseFacilitiesSectionGUI browseGUI = new BrowseFacilitiesSectionGUI();
        browseGUI.setVisible(false);

        // Add facilities section //
        AddFacilitySection addFacilities = new AddFacilitySection();

        // Add GUI to recycling frame //
        RecyclingFrameGUI recyclingGUI = new RecyclingFrameGUI(depots.getGUI(), browseGUI, addFacilities.getGUI());
        recyclingGUI.setVisible(true);
    }
}
