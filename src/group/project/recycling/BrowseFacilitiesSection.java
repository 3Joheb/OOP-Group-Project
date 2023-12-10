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
    private final List<FacilityCard> fileFacilityList = new ArrayList<>();

    // List to store card data that will be displayed
    // This list can be filtered
    private List<FacilityCard> facilityList = new ArrayList<>();

    // Set accepted waste list
    private final List<String> acceptedWaste = Arrays.asList("Paper (newspapers, magazines, cardboard)",
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
                card.setFacilityName(name);
                card.setCounty(county);
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
    private List<FacilityCard> getWasteFilter(List<FacilityCard> list, String waste) {
        List<FacilityCard> filteredList = new ArrayList<>();
        waste = waste.toLowerCase();

        // Check each card
        for (FacilityCard card : list) {
            List<String> cardWaste = card.getAcceptedWaste();

            // Check waste filter
            for (String wasteType : cardWaste) {
                wasteType = wasteType.toLowerCase();
                if (wasteType.equals(waste)) {
                    filteredList.add(card);
                    break;
                }
            }
        }

        return filteredList;
    }

    private List<FacilityCard> getCountyFilter(List<FacilityCard> list, String county) {
        List<FacilityCard> filteredList = new ArrayList<>();
        county = county.toLowerCase();

        // Check each card
        for (FacilityCard card : list) {
            String cardCounty = card.getCounty();
            cardCounty = cardCounty.toLowerCase();

            if (cardCounty.equals(county)) {
                filteredList.add(card);
            }
        }

        return filteredList;
    }

    private List<FacilityCard> getSearchFilter(List<FacilityCard> list, String query) {
        List<FacilityCard> filteredList = new ArrayList<>();
        String lowerQuery = query.toLowerCase();

        for (FacilityCard card : list) {
            String lowerName = card.getFacilityName().toLowerCase();
            if (lowerName.equals(lowerQuery)) {
                filteredList.add(card);
            }
        }

        return filteredList;
    }

    private List<FacilityCard> getFilteredList(String query, String county, String waste) {
        List<FacilityCard> filteredList;

        // Ternaries prevent filter functions from processing the list
        filteredList = query.isBlank() ? fileFacilityList : getSearchFilter(fileFacilityList, query);
        filteredList = county.equals("NONE") ? filteredList : getCountyFilter(filteredList, county); 
        filteredList = waste.equals("NONE") ? filteredList : getWasteFilter(filteredList, waste);
        return filteredList;
    }

    // Load new card list
    public void loadNewCards(String query, String county, String waste) {
        // If no filter selected by GUI
        facilityList = getFilteredList(query, county, waste);
    }
}
