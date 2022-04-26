/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author Udani Dias
 */
public class Product {

    private String product_ID;
    private String product_Name;
    private String product_Description;
    private double purchase_Price;
    private double selling_Price;
    private int quantity;
    //Creating Member variables

    public Product() {
        product_ID = "P000";
        product_Name = "";
        product_Description = "";
        purchase_Price = 0.0;
        selling_Price = 0.0;
        quantity = 0;

    }

    public Product(String product_ID, String product_Name, String product_Description, double purchase_Price, double selling_Price, int quantity) {
        this.product_ID = product_ID;
        this.product_Name = product_Name;
        this.product_Description = product_Description;
        this.purchase_Price = purchase_Price;
        this.selling_Price = selling_Price;
        this.quantity = quantity;
        //Creating Constructors
    }

    //Creating Setters
    public void setProductID(String product_ID) {
        this.product_ID = product_ID;
    }

    public void setProductName(String product_Name) {
        this.product_Name = product_Name;
    }

    public void setDescription(String product_Description) {
        this.product_Description = product_Description;
    }

    public void setPurchasePrice(double purchase_Price) {
        this.purchase_Price = purchase_Price;
    }

    public void setSellingPrice(double selling_Price) {
        this.selling_Price = selling_Price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //Creating getters

    public String getProductID() {
        return product_ID;
    }

    public String getProductName() {
        return product_Name;
    }

    public String getProductDescription() {
        return product_Description;
    }

    public double getPurchasePrice() {
        return purchase_Price;
    }

    public double getSellingPrice() {
        return selling_Price;
    }

    public int getQuantity() {
        return quantity;
    }
}
