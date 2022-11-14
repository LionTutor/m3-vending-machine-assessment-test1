/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.vendingmachine;

/**
 *
 * @author lionwife
 */
public class TestBasedVendingMachine implements VendingMachine{
    
    private int selectedProduct;
    private CoinBundle change;
    
    @Override
    public void displayProducts() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println(" *********************************************");
        System.out.println("     WELCOME TO THE VENDING MACHINE           ");
        System.out.println(" *********************************************");
        
        System.out.println("            Products available:               ");
        System.out.println("                                              ");
        for(Product product: Product.values()){   
                System.out.println("     " + product.getId()+ "  " + product.name() + " - Price: " + product.getPrice() + "   ");            
        }
        System.out.println("                                              ");
        System.out.println(" Please select your product: ");


    }

    @Override
    public void selectProduct(int product) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.selectedProduct = product;
    }

    @Override
    public void displayEnterCoinsMessage() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println(" Please enter coins as follows: ");
        System.out.println(" num of 5 cents coins,num of 10 cents coins,num of 20 cents coins,num of 50 cents coins,num of 100 cents coins  ");
        System.out.println("                                              ");
        System.out.println(" Example: If you would like to enter 2 ten cents coins: 0,2,0,0,0");
        System.out.println("Plese enter coins:");
    }

    @Override
    public void enterCoins(int... coins) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       //Calculator calculator = null; 
       Calculator calculator = new SimpleCalculator();
       Product prodoct = Product.valueOf(this.selectedProduct);
       int total = calculator.calculateTotal(new CoinBundle(coins));
       
       int changeAmout = total - prodoct.getPrice();
       this.change = calculator.calculateChange(changeAmout);
    //   VendingMachineRequest request = new VendingMachineRequest(selectedProduct, coins);
    //    change = controller.calculateChange(request);

    }

    @Override
    public void displayChangeMessage() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("                                              ");
        System.out.println("Your change is :"+ change.getTotal()+"cents splitted as follows: ");
        System.out.println("    100 cents coins: "+ change.number100CentsCoins);
        System.out.println("    50 cents coins: "+ change.number50CentsCoins);
        System.out.println("    20 cents coins: "+ change.number20CentsCoins);
        System.out.println("    10 cents coins: "+ change.number10CentsCoins);
        System.out.println("    5 cents coins: "+ change.number5CentsCoins);
    }
    
}
