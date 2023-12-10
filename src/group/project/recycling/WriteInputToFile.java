/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author zoheb
 */
// This class takes inputs from textfields and writes them to a file
public class WriteInputToFile {
    // Spread operator to treat each argument as if they're part of a list
    // This allows a dynamic amount of arguments
    protected List<String> readDataFromFields(JTextField... tf){
        // Empty list to house text field values
        List<String> inputList = new ArrayList();
        
        // Iterate and extract each text field value
        for(JTextField tfValue : tf){
            String value = tfValue.getText();
            
            // Add value to list
            inputList.add(value);
        }
        
        // Return input list values
        return inputList;
    }
    
    // Write data to JSON file
    protected void writeToFile(){
    }
    
}
