/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

/**
 *
 * @author Udani Dias
 */
public class Invoice {
     //member variables
    private String invoice_no;
    private String customer_id;
    private String invoice_date;
    private double total_price;
    private double total_discount;
    
    private String product_id;
    private double unit_price;
    private int quantity;
    private double discount_per_unit;
    private double item_total_price;

    //constructors
    public Invoice() {
        
        invoice_no="I000";
        customer_id="C000";
        invoice_date="";
        total_price=0.0;
        total_discount=0.0;

        product_id="P000";
        unit_price=0.0;
        quantity=0;
        discount_per_unit=0.0;
        item_total_price=0.0;
    }

    public Invoice(String invoice_no, String customer_id, String invoice_date, double total_price, double total_discount, String product_id, double unit_price, int quantity, double discount_per_unit, double item_total_price) {
        this.invoice_no = invoice_no;
        this.customer_id = customer_id;
        this.invoice_date = invoice_date;
        this.total_price = total_price;
        this.total_discount = total_discount;
        this.product_id = product_id;
        this.unit_price = unit_price;
        this.quantity = quantity;
        this.discount_per_unit = discount_per_unit;
        this.item_total_price = item_total_price;
    }

    
    //setters
    public void setInvoiceNumber(String invoice_no) {
        this.invoice_no = invoice_no;
    }

    public void setCustomerID(String customer_id) {
        this.customer_id = customer_id;
    }

    public void setInvoiceCreateDate(String invoice_date) {
        this.invoice_date = invoice_date;
    }

    public void setInvoiceTotalAmount(double total_price) {
        this.total_price = total_price;
    }

    public void setInvoiceTotalDiscount(double total_discount) {
        this.total_discount = total_discount;
    }

    public void setProductID(String product_id) {
        this.product_id = product_id;
    }

    public void setUnitPerPrice(double unit_price) {
        this.unit_price = unit_price;
    }

    public void setItemQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPerItemDiscount(double discount_per_unit) {
        this.discount_per_unit = discount_per_unit;
    }

    public void setPerItemTotal(double item_total_price) {
        this.item_total_price = item_total_price;
    }
    
    
    //getters

    public String getInvoiceNo() {
        return invoice_no;
    }

    public String getCustomerID() {
        return customer_id;
    }

    public String getInvoiceCreateDate() {
        return invoice_date;
    }

    public double getInvoiceTotalAmount() {
        return total_price;
    }

    public double getInvoiceTotalDiscount() {
        return total_discount;
    }

    public String getProductID() {
        return product_id;
    }

    public double getUnitPerPrice() {
        return unit_price;
    }

    public int getItemQuantity() {
        return quantity;
    }

    public double getPerItemDiscount() {
        return discount_per_unit;
    }

    public double getPerItemTotal() {
        return item_total_price;
    }
}
