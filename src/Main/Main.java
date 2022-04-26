/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import AdminTask.AdminTask;
import AdminTask.AdminTaskController;
import Customer.Customer;
import Customer.CustomerController;
import Invoice.Invoice;
import Invoice.InvoiceController;
import Invoice.InvoiceItemController;
import Product.Product;
import Product.ProductController;
import User.User;
import User.UserController;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mainExit = "n";
        String subExit = "n";
        boolean mainMenuSelector = false;
        boolean var5 = false;

        do {
            System.out.println("***Welcome To The Main Menu***");
            System.out.println("1) Manage product");
            System.out.println("2) Manage customers");
            System.out.println("3) Invoice Generation");
            System.out.println("4) Display all Invoices");
            System.out.println("5) Admin Tasks");
            System.out.println("6) Exit from the system");
            //Main Menu
            
            System.out.println("Please select a number from your menu card:");
            //getting user inputs inorder to select a function in the main menu
            
            int i = scanner.nextInt();
            int subMenuSelector;
            label47:
            switch (i) {
                case 1:
                    while (true) {
                        System.out.println("***Product Management Menu***");
                        System.out.println("1) Add product");
                        System.out.println("2) Delete product");
                        System.out.println("3) Update product");
                        System.out.println("4) Display a product details");
                        System.out.println("5) Display all the product details");
                        System.out.println("6) Back to the main menu");
                        System.out.print("Please select a number from the function menu : ");
                        //Product Menu
                        
                        subMenuSelector = scanner.nextInt();
                        switch (subMenuSelector) {
                            case 1:
                                System.out.println("*** You selected Add a new Product Function ***");
                                break;
                            case 2:
                                System.out.println("*** You selected Delete Product Function ***");
                                break;
                            case 3:
                                System.out.println("*** You selected update Product Function ***");
                                break;
                            case 4:
                                System.out.println("*** You selected Display Product Function ***");
                                break;
                            case 5:
                                System.out.println("*** You selected Display All Products Function ***");
                            case 6:
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }

                        System.out.println("Do you want to exit?(Enter (yes/no))");
                        subExit = scanner.next();
                        if (!subExit.equals("no")) {
                            break label47;
                        }
                    }
                case 2:
                    while (true) {
                        System.out.println("***Customer Menu***");
                        System.out.println("1) Add customer");
                        System.out.println("2) Delete customer");
                        System.out.println("3) Update customer");
                        System.out.println("4) Display a customer details");
                        System.out.println("5) Display all the customer details");
                        System.out.println("6) Back to main menu");
                        System.out.print("please select a number from the function menu : ");
                        //Customer Menu
                        
                        subMenuSelector = scanner.nextInt();
                        switch (subMenuSelector) {
                            case 1:
                                System.out.println("*** You selected Add a new Customer Function ***");
                                break;
                            case 2:
                                System.out.println("*** You selected Delete Customer Function ***");
                                break;
                            case 3:
                                System.out.println("*** You selected update a Customer Function ***");
                                break;
                            case 4:
                                System.out.println("*** You selected Display a Customer Function ***");
                                break;
                            case 5:
                                System.out.println("*** You selected Display All Customer Function ***");
                            case 6:
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }

                        System.out.println("Do you want to exit??(Enter (yes/no))");
                        subExit = scanner.next();
                        if (!subExit.equals("no")) {
                            break label47;
                        }
                    }
                case 3:
                    System.out.println("***Welcome to The Invoice Generation Process***");
                    break;
                case 4:
                    System.out.println("***Display all the Generated Invoices***");
                    break;
                case 5:
                    System.out.println("***Display all the Admin Tasks***");
                case 6:
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("Do you want to go Back to The Main Menu?(press (yes/no))");
            mainExit = scanner.next();
            //exit
        } while (mainExit.equals("yes"));

        System.out.println("Thank you!");
    }
}
