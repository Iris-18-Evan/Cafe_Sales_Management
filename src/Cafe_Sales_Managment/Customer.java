/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafe_Sales_Managment;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ucwaz
 */
public class Customer {
    
    // Fields
    private String name;
    private String phone;
    private String address;

    // Constructor
    public Customer(String n, String p, String a) {
        this.name = n;
        this.phone = p;
        this.address = a;
    }

    // Getters (Needed for the lookup logic)
    public String getName() { 
        return name; 
    }
    public String getPhone() { 
        return phone;
    }
    public String getAddress() {
        return address;
    }

    // Mock Database (Replace with database logic later)
    public static final List<Customer> CUSTOMERS_DB = new ArrayList<>();

    // Static block to populate initial data
    static {
        CUSTOMERS_DB.add(new Customer("Alice", "111-222-3333", "123 Main St"));
        CUSTOMERS_DB.add(new Customer("Bob", "444-555-6666", "456 Oak Ave"));
    }
    
}
