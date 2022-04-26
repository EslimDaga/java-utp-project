/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author eslim
 */
public class Product {
    int id_product;
    String name_product, description_product;
    int price_product;
    
    public Product(
        int id_product,
        String name_product,
        String description_product,
        int price_product 
    ){
        this.id_product = id_product;
        this.name_product = name_product;
        this.description_product = description_product;
        this.price_product = price_product;
    } 
}
