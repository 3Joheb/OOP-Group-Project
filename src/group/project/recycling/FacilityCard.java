/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project.recycling;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zoheb
 */
public class FacilityCard {

    // Use placeholders to prevent errors
    private String name = "Name";
    private String street = "Street";
    private String city = "City";
    private String county = "County";

    // Time format is military
    private String openTime = "0000";
    private String closeTime = "0000";

    private List<String> acceptedWaste = new ArrayList();

    private String email = "default@email.com";
    private String phoneNumber = "01";

    private String imgPath = "/group/project/recycling/img/placeholder.png";

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setStreet(String street) {
        if (street != null) {
            this.street = street;
        }
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        if (city != null) {
            this.city = city;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCounty(String county) {
        if (county != null) {
            this.county = county;
        }
    }

    public String getCounty() {
        return county;
    }

    public void setOpenTime(String openTime) {
        if (openTime != null) {
            this.openTime = openTime;
        }
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setCloseTime(String closeTime) {
        if (closeTime != null) {
            this.closeTime = closeTime;
        }
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setAcceptedWaste(List<String> waste) {
        if (waste != null) {
            acceptedWaste = waste;
        }
    }

    public List<String> getAcceptedWaste() {
        return acceptedWaste;
    }

    public void setEmail(String email) {
        if (email != null) {
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setNum(String num) {
        if (num != null) {
            this.phoneNumber = num;
        }
    }

    public String getNum() {
        return phoneNumber;
    }

    public void setImgPath(String path) {
        if (path != null) {
            this.imgPath = path;
        }
    }

    public String getImgPath() {
        return imgPath;
    }
}
