/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import group.project.recycling.POJOs.Address;
import group.project.recycling.POJOs.Contact;
import group.project.recycling.POJOs.Facility;
import group.project.recycling.POJOs.Time;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author zoheb
 */
public class AddFacilitySection {

    // Save GUI instance
    private final AddFacilitySectionGUI GUI;

    // Image variables
    private String sourcePath;
    private String imageName;

    // Form text field variables
    private String companyName;
    private String facilityName;
    private String email;
    private String number;
    private String street;
    private String city;
    private String county;
    private String openTime;
    private String closeTime;
    private List<String> acceptedWaste;
    private String destinationPath;

    public AddFacilitySection() {
        GUI = new AddFacilitySectionGUI(this);
        GUI.setVisible(false);
    }

    public AddFacilitySectionGUI getGUI() {
        return GUI;
    }

    // Check file type is image
    private boolean isFileImage(File file) {
        String fileName = file.getName().toLowerCase();
        return fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png");
    }

    // Copy file from source to destination
    private void saveImageLocally() {
        // "Guard clause" to check file variables are valid
        if (sourcePath == null || imageName == null) {
            System.out.println("Add Facility: saveImageLocally() not executed, sourcePath || imageName == null ");
            return;
        }

        // Create unique file name
        String fileName = "facility_" + System.currentTimeMillis() + "-" + imageName;

        // Attach file name to file destination path
        String destinationPath = "src/group/project/recycling/img/" + fileName;
        this.destinationPath = "/group/project/recycling/img/" + fileName;

        try {
            // Set source & destination paths
            Path source = Paths.get(sourcePath);
            Path destination = Paths.get(destinationPath);

            // Copy file from source to destination
            Files.copy(source, destination);

            System.out.println("Add Facility: Image copied successfully to " + destination);

            // Reset file variables
            sourcePath = null;
            imageName = null;
        } catch (IOException e) {
            System.out.println("Add Facility: Error copying image: " + e);
        }
    }

    // Do some file checks
    public void resolveFile(File selectedFile) {
        // Check file is image
        if (isFileImage(selectedFile)) {
            sourcePath = selectedFile.getAbsolutePath();
            imageName = selectedFile.getName();
            System.out.println(sourcePath);
        } else {
            System.out.println("File type not supported, please select .jpg, .jpeg or .png");
        }
    }

    // Save data to JSON file
    public void saveJSONFile() {
        // Save image locally
        saveImageLocally();
        sourcePath = null;
        
        // JSON file path
        String filePath = "src/group/project/recycling/data/facilities.json";

        // Create instance of ObjectMapper
        ObjectMapper objMapper = new ObjectMapper();

        // Create POJO
        Address addressObj = new Address(street, city, county);
        Contact contactObj = new Contact(email, number);
        Time timeObj = new Time(openTime, closeTime);
        Facility facilityObj = new Facility(companyName, facilityName, contactObj, addressObj, timeObj, acceptedWaste, destinationPath);
        System.out.println(facilityObj);

        try {
            File file = new File(filePath);

            // Check if file exists
            if (file.exists()) {
                // Use readValue() instead of readTree() because we have a class to map to
                // TypeReference tells Jackson the deserialized object should be the type List<User>
                List<Facility> facilityList = objMapper.readValue(file, new TypeReference<List<Facility>>() {
                });

                // Add object to existing user list
                facilityList.add(facilityObj);

                // Write to file
                objMapper.writeValue(file, facilityList);

                // Print succes
                System.out.println("Add Facility: Successfully wrote to User json file");
            } else {
                // Collections.singleton() returns a list containing the argument e.g. [userObj]
                // This makes sure the root JSON data type is a list and not an object
                List<Facility> facilityList = Collections.singletonList(facilityObj);

                // Create new file
                objMapper.writeValue(file, facilityList);

                // Print succes
                System.out.println("Add Facility: Successfully wrote to User json file");
            }
        } catch (IOException e) {
            // Print error
            System.out.println("Add Facility: Error saving User json file" + e);
        }
    }

    public void setCompanyName(String name) {
        companyName = formatText(name);
    }

    public void setFacilityName(String name) {
        facilityName = formatText(name);
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

    public void setOpenTime(String time) {
        // Format is military e.g. 0700 = 7am
        openTime = formatText(time);
    }

    public void setCloseTime(String time) {
        closeTime = formatText(time);
    }

    public void setAcceptedWaste(List<String> waste) {
        acceptedWaste = waste;
    }

    public String getImgPath() {
        return sourcePath;
    }
    
    private String formatText(String text){
        return text.replaceAll("\\s+", " ");
    }
}
