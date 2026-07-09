/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package i_hungry;

/**
 *
 * @author W3 Computers
 */
public class Customers {
    private String customerId;
    private String customerName;
    private int totalQTY;
    private double totalPrice;

    Customers(String customerId,String customerName,int totalQTY,double totalPrice){
        setCustomerId(customerId);
        setCustomerName(customerName);
        setTotalQTY(totalQTY);
        setTotalPrice(totalPrice);
    }
    public void setCustomerId(String customerId){
        this.customerId=customerId;
    }
    
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    
    public void setCustomerQTY(int totalQTY){
        this.totalQTY=totalQTY;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice=totalPrice;
    }
    public String getCustomerId(){
        return this.customerId;
    }
    public String getCustomerName(){
        return this.customerNAME;
    }
    public String getTotalQTY(){
        return this.totalQTY;
    }
    public String getTotalPrice(){
        return this.totalPrice;
    }
}
