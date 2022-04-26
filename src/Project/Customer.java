/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author eslim
 */
public class Customer {
    int id_customer;
    String firstname_customer,lastname_customer, username_customer, password_customer; 
    int dni_customer;
    
    public Customer(
        int id_customer,
        String firstname_customer,
        String lastname_customer,
        String username_customer,
        String password_customer,
        int dni_customer
    ){
        this.id_customer = id_customer;
        this.firstname_customer = firstname_customer;
        this.lastname_customer = lastname_customer;
        this.username_customer = username_customer;
        this.password_customer = password_customer;
        this.dni_customer = dni_customer;
    }
}
