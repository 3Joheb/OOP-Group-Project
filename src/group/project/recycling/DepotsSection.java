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
import java.util.List;

/**
 *
 * @author zoheb
 */
public class DepotsSection {

    // List to store card data
    private List<DepotCard> depotList = new ArrayList<>();

    public DepotsSection() {
        // Load JSON
        JsonNode data = loadJSONFile();
        
        // Handle data error
        if(data == null){
            createPlaceholderCards(depotList);
        } else {
            createCards(data, depotList);
        }
    }

    // Load the JSON file data
    private JsonNode loadJSONFile() {
        // Add Depot Cards using json file
        try {
            // JSON file path
            String filePath = "src/group/project/recycling/data/depots.json";

            // Create instance of ObjectMapper
            ObjectMapper objMapper = new ObjectMapper();

            // Read JSON file into JsonNode
            JsonNode jsonNode = objMapper.readTree(new File(filePath));
            return jsonNode;
        } catch (IOException e) {
            // Print error
            System.out.println("Error opening json file" + e);
            return null;
        }
    }

    // Create new instance of card using loaded data and store it
    private void createCards(JsonNode data, List<DepotCard> depotList) {
        // Check if root is array to prevent errors
        if (data.isArray()) {
            // Iterate over each element in array
            for (JsonNode depotObj : data) {
                // Store json values
                // Note that I've added no error handling for non existing keys
                String name = depotObj.get("name").asText();
                String location = depotObj.get("location").get("address").asText();
                String openTime = depotObj.get("time").get("open").asText();
                String closeTime = depotObj.get("time").get("close").asText();
                String number = depotObj.get("contact").get("phone").asText();

                // Create new instance of class to store data
                DepotCard card = new DepotCard();
                card.setName(name);
                card.setLocation(location);
                card.setOpenTime(openTime);
                card.setCloseTime(closeTime);
                card.setPhoneNumber(number);
                card.setReadError("");

                // Add objects to list
                depotList.add(card);
            }
        }
    }

    private void createPlaceholderCards(List<DepotCard> depotList) {
        // Create placeholder cards
        for (int i = 0; i < 6; i++) {
            // Card functionality class
            DepotCard card = new DepotCard();
            depotList.add(card);
        }
    }
    
    public List<DepotCard> getCardsList(){
        return depotList;
    }
}
