/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.vendingmachine;

import java.util.Scanner;

/**
 *
 * @author lionwife
 */
public class Main {

     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // TODO To complete in step3
        VendingMachine vendingMachine = new TestBasedVendingMachine();

        vendingMachine.displayProducts();

        String selectedProduct = scanner.nextLine();
        int selectProductNumber = Integer.parseInt(selectedProduct);
        vendingMachine.selectProduct(selectProductNumber);

        vendingMachine.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();
        //int[] enteredCoins = {}; // TODO Complete in step 3
        int[] enteredCoins = Coin.parseCoins(userEnteredCoins);
        vendingMachine.enterCoins(enteredCoins);

        vendingMachine.displayChangeMessage();

    }
}
