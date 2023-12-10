/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import group.project.recycling.POJOs.Address;
import group.project.recycling.POJOs.Contact;
import group.project.recycling.POJOs.User;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author zoheb
 */
public class DepotsSection {

    private final DepotsSectionGUI GUI;

    private String fullName;
    private String email;
    private String number;
    private String street;
    private String city;
    private String county;
    private Integer paymentValue;

    // List to store card data
    private List<DepotCard> depotList = new ArrayList<>();

    public DepotsSection() {
        // Load JSON
        JsonNode data = loadJSONFile();

        // Handle data error
        if (data == null) {
            createPlaceholderCards(depotList);
        } else {
            createCards(data, depotList);
        }

        // Create new GUI instance
        // Pass DepotsSection as an argument so GUI has access to objects
        GUI = new DepotsSectionGUI(this);
    }

    // Load the JSON file data
    private JsonNode loadJSONFile() {
        // JSON file path
        String filePath = "src/group/project/recycling/data/depots.json";

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

    // Save data to JSON file
    public void saveJSONFile() {
        // JSON file path
        String filePath = "src/group/project/recycling/data/users.json";

        // Create instance of ObjectMapper
        ObjectMapper objMapper = new ObjectMapper();

        // Create POJO
        Address addressObj = new Address(street, city, county);
        Contact contactObj = new Contact(email, number);
        User userObj = new User(fullName, contactObj, addressObj, paymentValue);

        try {
            File file = new File(filePath);

            // Check if file exists
            if (file.exists()) {
                // Use readValue() instead of readTree() because we have a class to map to
                // TypeReference tells Jackson the deserialized object should be the type List<User>
                List<User> userList = objMapper.readValue(file, new TypeReference<List<User>>() {
                });

                // Add object to existing user list
                userList.add(userObj);

                // Write to file
                objMapper.writeValue(file, userList);

                // Print succes
                System.out.println("Successfully wrote to User json file");
            } else {
                // Collections.singleton() returns a list containing the argument e.g. [userObj]
                // This makes sure the root JSON data type is a list and not an object
                List<User> userList = Collections.singletonList(userObj);

                // Create new file
                objMapper.writeValue(file, userList);

                // Print succes
                System.out.println("Depots: Successfully wrote to User json file");
            }
        } catch (IOException e) {
            // Print error
            System.out.println("Depots: Error saving User json file" + e);
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
                String street = depotObj.get("address").get("street").asText();
                String city = depotObj.get("address").get("city").asText();
                String openTime = depotObj.get("time").get("open").asText();
                String closeTime = depotObj.get("time").get("close").asText();
                String num = depotObj.get("contact").get("number").asText();

                // Create new instance of class to store data
                DepotCard card = new DepotCard();
                card.setName(name);
                card.setStreet(street);
                card.setCity(city);
                card.setOpenTime(openTime);
                card.setCloseTime(closeTime);
                card.setPhoneNumber(num);
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

    public List<DepotCard> getCards() {
        return depotList;
    }

    public DepotsSectionGUI getGUI() {
        return GUI;
    }

    public void setFullName(String fn) {
        fullName = formatText(fn);
    }

    public void setEmail(String email) {
        this.email = formatText(email);
    }

    public void setNumber(String num) {
        number = formatText(num);
    }

    public void setStreet(String street) {
        this.street = formatText(street);
    }

    public void setCity(String city) {
        this.city = formatText(city);
    }

    public void setCounty(String county) {
        this.county = formatText(county);
    }

    public void setPaymentValue(Integer value) {
        paymentValue = value;
    }

    private String formatText(String text) {
        return text.replaceAll("\\s+", " ");
    }
}
