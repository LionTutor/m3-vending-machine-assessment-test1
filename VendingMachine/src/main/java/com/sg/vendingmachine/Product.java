/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.sg.vendingmachine;

/**
 *
 * @author lionwife
 */
public enum Product {
    TWIX(1,100), COKE(2,50), WATER(3,30), SANDWICH(4,150);
    private int id;
    private int price;

    Product(int id, int price){
            this.id = id;
            this.price = price;
    }    
    public int getId() {
        return this.id;
    }


    public int getPrice() {
        return this.price;
    }  

    public static Product valueOf(int numberSelected){
        for(Product product: Product.values()){
            if(numberSelected == product.getId()){
                return product;
            }
        }
        return null;
    }
    
}
