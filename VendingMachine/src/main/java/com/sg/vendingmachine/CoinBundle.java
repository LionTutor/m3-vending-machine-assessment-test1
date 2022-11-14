/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.vendingmachine;

/**
 *
 * @author lionwife
 */
public class CoinBundle {
    public int number5CentsCoins;
    public int number10CentsCoins;
    public int number20CentsCoins;
    public int number50CentsCoins;
    public int number100CentsCoins;

    public CoinBundle(int... enteredCoins) {
        this.number5CentsCoins = enteredCoins[0];
        this.number10CentsCoins = enteredCoins[1];
        this.number20CentsCoins = enteredCoins[2];
        this.number50CentsCoins = enteredCoins[3];
        this.number100CentsCoins = enteredCoins[4];
    }
    
    public int getTotal(){
            //return -1;
            int total = 0;
        total = total+this.number5CentsCoins*5;
        total = total+this.number10CentsCoins*10;
        total = total+this.number20CentsCoins*20;
        total = total+this.number50CentsCoins*50;
        total = total+this.number100CentsCoins*100;
        return total;
    }
    
}
