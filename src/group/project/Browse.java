/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project;

/**
 *
 * @author adria
 */
public class Browse {
    private String  Size, Type, Name;
    private double Price;

    public Browse(){
    Size = "" ;
    Type = "" ;
    Name = "" ;
    Price = 0.0;
}
    public Browse(String Quality,String Size,String Type, String Name, double Price  ){
       
         this.Size = Size;
        this.Type = Type;
        this.Name = Name;
        this.Price = Price;
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

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

   
    
    
}
