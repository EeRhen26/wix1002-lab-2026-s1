/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;

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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celcius = (fahrenheit - 32)/1.8;
        System.out.print("The temperature is ");
        System.out.printf("%.2f",celcius);
        System.out.println(" celcius");
    }
    
}
