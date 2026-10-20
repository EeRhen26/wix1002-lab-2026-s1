/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

/**
 *
 * @author tanee
 */

import java.util.Scanner;

public class MyProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the price of the car: ");
        double price = input.nextDouble();
        System.out.print("Enter the down payment: ");
        double down = input.nextDouble();
        System.out.print("Enter the interest rate in %: ");
        double rate = input.nextDouble();
        System.out.print("Enter loan duration in year: ");
        double year = input.nextDouble();
        double pay = (price-down)*(1+rate*year/100)/(year*12);
        System.out.print("The monthly payment is: RM");
        System.out.printf("%.2f%n",pay);
    }
    
}
