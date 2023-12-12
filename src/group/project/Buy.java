/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.project;

/**
 *
 * @author adria
 */
public class Buy {
    private String  Name, Address, CardNum;
    private double Price;

    public Buy(){
    Name = "" ;
    Address ="" ;
    CardNum = "";
    Price = 0.0;
}
     public boolean submitOrder() {
        if (Name != null && !Name.isEmpty() && Address != null && !Address.isEmpty() && CardNum != null && !CardNum.isEmpty() && Price > 0.0) {
            System.out.println("Order submitted for " + Name + " at address: " + Address + ". Total price: " + Price);
            return true; //if order is succsessful
           
        }
                 System.out.println("Order submission failed. Please fill in all fields.");
        return false;
     }
    public Buy( String Name, String Address,String CardNum, double Price  ){
        this.Name = Name;
        this.Address = Address;
        this.CardNum = CardNum;
        this.Price = Price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCardNum() {
        return CardNum;
    }

    public void setCardNum(String CardNum) {
        this.CardNum = CardNum;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

   
}
