/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling;

import java.util.List;

/**
 *
 * @author zoheb
 */
public class Recycling {

//    public static void main(String[] args) {
//
//    }
    public void initSection() {
        // Add depots section //
        // Code
        DepotsSection depots = new DepotsSection();
        List<DepotCard> cards = depots.getCardsList();

        // GUI
        DepotsSectionGUI depotsGUI = new DepotsSectionGUI();
        depotsGUI.setVisible(true);

        // Create card GUIs
        for (DepotCard card : cards) {
            depotsGUI.createNewCard(card);
        }

        // Add browse section //
        BrowseFacilitiesSectionGUI browseGUI = new BrowseFacilitiesSectionGUI();
        browseGUI.setVisible(false);

        // Add facilities section //
        AddFacilitySectionGUI facilitiesGUI = new AddFacilitySectionGUI();
        facilitiesGUI.setVisible(false);

        // Add GUI to recycling frame //
        RecyclingFrameGUI recyclingGUI = new RecyclingFrameGUI(depotsGUI, browseGUI, facilitiesGUI);
        recyclingGUI.setVisible(true);
    }
}
