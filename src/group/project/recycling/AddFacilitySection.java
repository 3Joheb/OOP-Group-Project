/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author zoheb
 */
public class AddFacilitySection {

    // Save GUI instance
    private final AddFacilitySectionGUI GUI;

    private String sourcePath;
    private String imageName;

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
    public void saveImageLocally() {
        // "Guard clause" to check file variables are valid
        if(sourcePath == null || imageName == null) {
            System.out.println("saveImageLocally() not executed, sourcePath || imageName == null ");
            return;
        }
        
        // Create unique file name
        String fileName = "facility_" + System.currentTimeMillis() + "-" + imageName;

        // Attach file name to file destination path
        String destinationPath = "src/group/project/recycling/img/" + fileName;

        try {
            // Set source & destination paths
            Path source = Paths.get(sourcePath);
            Path destination = Paths.get(destinationPath);

            // Copy file from source to destination
            Files.copy(source, destination);

            System.out.println("Image copied successfully to " + destination);
            
            // Reset file variables
            sourcePath = null;
            imageName = null;
        } catch (IOException e) {
            System.out.println("Error copying image: " + e);
        }
    }

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
}
