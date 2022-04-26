/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author Udani Dias
 */
public class Customer {

    private String customer_ID;
    private String customer_Name;
    private String email;
    private String address;
    private int contact_Number;
    private String date_Of_Birth;
    private String gender;
    //Creating Member variables

    public Customer() {
        customer_ID="C000";
        customer_Name="Unknown-Customer";
        email="Unkown-Email";
        address="Unkown-Address";
        contact_Number=0111111111;
        date_Of_Birth="";
        gender="";
    }

    public Customer(String customer_ID, String customer_Name, String email, String address, int contact_Number, String date_Of_Birth, String gender) {
        this.customer_ID = customer_ID;
        this.customer_Name = customer_Name;
        this.email = email;
        this.address = address;
        this.contact_Number = contact_Number;
        this.date_Of_Birth = date_Of_Birth;
        this.gender = gender;
        //Creating Constructors
    }
    
    //setters
    public void setCustomerID(String customer_ID) {
        this.customer_ID = customer_ID;
    }

    public void setCustomerName(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNumber(int contact_Number) {
        this.contact_Number = contact_Number;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.date_Of_Birth = date_Of_Birth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    //getters
    public String getCustomerID() {
        return customer_ID;
    }

    public String getCustomerName() {
        return customer_Name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getContactNumber() {
        return contact_Number;
    }

    public String getDateOfBirth() {
        return date_Of_Birth;
    }

    public String getGender() {
        return gender;
    }


}
