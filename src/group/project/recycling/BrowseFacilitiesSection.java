/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author zoheb
 */
public class BrowseFacilitiesSection {

    private final BrowseFacilitiesSectionGUI GUI;

    // List to store card data from JSON file
    private List<FacilityCard> fileFacilityList = new ArrayList<>();

    // List to store card data that will be displayed
    // This list can be filtered
    private List<FacilityCard> facilityList = new ArrayList<>();

    // Set accepted waste list
    private List<String> acceptedWaste = Arrays.asList("Paper (newspapers, magazines, cardboard)",
            "Plastic bottles",
            "Glass bottles and jars",
            "Aluminum cans",
            "Steel cans",
            "Electronics (computers, laptops, smartphones)",
            "Batteries (alkaline, rechargeable)",
            "Textiles (clothing, shoes)",
            "Organic waste (food scraps, yard waste)",
            "Metal appliances (refrigerators, washing machines)",
            "Paperboard (cereal boxes, shoeboxes)",
            "Styrofoam",
            "Light bulbs (CFLs, LEDs)",
            "Printer cartridges",
            "Tires",
            "Paint cans",
            "Wood waste",
            "Used cooking oil",
            "Household hazardous waste (cleaning products, chemicals)",
            "Plastic bags");

    public BrowseFacilitiesSection() {
        // Load JSON
        JsonNode data = loadJSONFile();

        // Handle data error
        if (data != null) {
            createCards(data, fileFacilityList);
            facilityList = fileFacilityList;
        } else {
            System.out.println("Browse: No cards loaded");
        }

        // Create GUI
        GUI = new BrowseFacilitiesSectionGUI(this);
        GUI.setVisible(false);
    }

    public BrowseFacilitiesSectionGUI getGUI() {
        return GUI;
    }

    public List<FacilityCard> getList() {
        return facilityList;
    }

    // Load the JSON file data
    private JsonNode loadJSONFile() {
        // JSON file path
        String filePath = "src/group/project/recycling/data/facilities.json";

        // Create instance of ObjectMapper
        ObjectMapper objMapper = new ObjectMapper();
        try {
            // Read JSON file into JsonNode
            // readTree() is useful if you want to traverse JSON without having a predefined class to map to
            JsonNode jsonNode = objMapper.readTree(new File(filePath));
            return jsonNode;
        } catch (IOException e) {
            // Print error
            System.out.println("Error opening json file" + e);
            return null;
        }
    }

    // Create new instance of card using loaded data and store it
    private void createCards(JsonNode data, List<FacilityCard> facilityList) {
        // Check if root is array to prevent errors
        if (data.isArray()) {
            // Iterate over each element in array
            for (JsonNode facilityObj : data) {
                // Store json values
                // Note that I've added no error handling for non existing keys
                String name = facilityObj.get("facility_name").asText();
                String street = facilityObj.get("address").get("street").asText();
                String city = facilityObj.get("address").get("city").asText();
                String county = facilityObj.get("address").get("county").asText();
                String openTime = facilityObj.get("time").get("opening").asText();
                String closeTime = facilityObj.get("time").get("closing").asText();
                String email = facilityObj.get("contact").get("email").asText();
                String num = facilityObj.get("contact").get("number").asText();
                String imgPath = (facilityObj.get("image_path") != null) ? facilityObj.get("image_path").asText() : "defaultImagePath";

                // Handle accepted waste since its an array
                JsonNode acceptedWasteNode = facilityObj.get("accepted_waste");
                List<String> acceptedWaste = new ArrayList();
                if (acceptedWasteNode.isArray()) {
                    for (JsonNode item : acceptedWasteNode) {
                        acceptedWaste.add(item.asText());
                    }
                }

                // Create new instance of class to store data
                FacilityCard card = new FacilityCard();
                card.setName(name);
                card.setStreet(street);
                card.setCity(city);
                card.setOpenTime(openTime);
                card.setCloseTime(closeTime);
                card.setAcceptedWaste(acceptedWaste);
                card.setEmail(email);
                card.setNum(num);
                card.setImgPath(imgPath);

                // Add objects to list
                facilityList.add(card);
            }
        }
    }

    // Return a filtered list of cards
    private List<FacilityCard> getFilteredList(List<FacilityCard> cards, String county, String waste) {
        List<FacilityCard> filteredList = new ArrayList<>();

        // Check each card
        for (FacilityCard card : cards) {
            boolean acceptCard = false;
            List<String> cardWaste = card.getAcceptedWaste();
            String cardCounty = card.getCounty();

            // Check waste filter
            if (waste.equals("NONE")) {
                acceptCard = true;  // No waste filter, accept all
            } else {
                for (String wasteType : cardWaste) {
                    if (wasteType.equals(waste)) {
                        acceptCard = true;
                        break;
                    }
                }
            }

            // Check county filter
            if (!county.equals("NONE") && !cardCounty.equals(county)) {
                acceptCard = false;
            }

            if (acceptCard) {
                filteredList.add(card);
            }
        }

        return filteredList;
    }

    // Load new card list
    public void loadNewCards(String county, String waste) {
        // If no filter selected by GUI
        facilityList = getFilteredList(fileFacilityList, county, waste);
    }
}
