/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project;

/**
 *
 * @author adria
 */
public class List {
    private String Quality, Size, Type, Name;
    private int Quantity; 
    private double Price;

    public List(){
    Quality = "";
    Size = "" ;
    Type = "" ;
    Name = "" ;
    Quantity = 0;
    Price = 0.0;
}
    public List(String Quality,String Size,String Type, String Name,int Quantity, double Price  ){
        this.Quality = Quality;
        this.Size = Size;
        this.Type = Type;
        this.Name = Name;
        this.Price = Price;
    }

    public String getQuality() {
        return Quality;
    }

    public void setQuality(String Quality) {
        this.Quality = Quality;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    
        

    
    
}
