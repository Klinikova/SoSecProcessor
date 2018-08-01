/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crate;

/**
 *
 * @author PolinaYoga
 */
public class CrateTest {
    // 6 x 10 x 12
    // 14 x 3 x 5
    public static void main(String[] args) {
        // first crate: 6 x 10 x 12
        Crate ourCrate = new Crate(); 
        ourCrate.setLength(6);
        ourCrate.setWidth(10);
        ourCrate.setHeight(12);
        
     // second crate: 14 x 3 x 5 
        Crate ourCrate2 = new Crate(); 
        ourCrate2.setLength(14);
        ourCrate2.setWidth(3);
        ourCrate2.setHeight(5);
        
        // Display volume, cost, price, and profit for first crate:
        
        System.out.println("First Crate:");
        System.out.printf("Dimensions are: %.2f x %.2f x %.2f" + ourCrate.calculateVolume());
        System.out.println("Volume: " + ourCrate.calculateVolume()); //System.out.printf("Volume (sq.ft): %.2f%n" + ourCrate.calculateVolume());
        System.out.println("Cost: $ " + ourCrate.cost()); // System.out.printf("Cost: $%.2f%n" + ourCrate.cost());
        System.out.println("Price: $ " + ourCrate.price()); // System.out.printf("Price: $%.2f%n" + ourCrate.price());
        System.out.println("Profit: $ " + ourCrate.profit()); // System.out.printf("Profit: $%.2f%n " + ourCrate.profit());
        // Display volume, cost, price, and profit for second crate:
    }
}
