/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.vendingmachine;

/**
 *
 * @author lionwife
 */
public class SimpleCalculator implements Calculator{

    @Override
    public int calculateTotal(CoinBundle enteredCoins) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //return 0;
        return enteredCoins.getTotal();
    }

    @Override
    public CoinBundle calculateChange(int amountMoneyToReturn) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        CoinBundle change = new CoinBundle(new int[5]);
        int remainingAmount = amountMoneyToReturn;
        
        change.number100CentsCoins = remainingAmount / 100;
        remainingAmount = remainingAmount %100;
        
        change.number50CentsCoins = remainingAmount / 50;
        remainingAmount = remainingAmount %50;
        
        change.number20CentsCoins = remainingAmount / 20;
        remainingAmount = remainingAmount %20;
        
        change.number10CentsCoins = remainingAmount / 10;
        remainingAmount = remainingAmount %10;
        
        change.number5CentsCoins = remainingAmount / 5;
        remainingAmount = remainingAmount %5;
        return change;
    }
    
}
