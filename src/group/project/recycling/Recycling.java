/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling;

/**
 *
 * @author zoheb
 */
public class Recycling {

    public void initSection() {
        // Add depots section //
        // Code
        DepotsSection depots = new DepotsSection();

        // Add browse section //
        BrowseFacilitiesSectionGUI browseGUI = new BrowseFacilitiesSectionGUI();
        browseGUI.setVisible(false);

        // Add facilities section //
        AddFacilitySectionGUI facilitiesGUI = new AddFacilitySectionGUI();
        facilitiesGUI.setVisible(false);

        // Add GUI to recycling frame //
        RecyclingFrameGUI recyclingGUI = new RecyclingFrameGUI(depots.getGUI(), browseGUI, facilitiesGUI);
        recyclingGUI.setVisible(true);
    }
}
