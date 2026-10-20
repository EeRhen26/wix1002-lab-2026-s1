/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;

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
	System.out.print("Enter the amount of water in gram: ");
	double gram = input.nextDouble();
	System.out.print("Enter the initial temperature in Fahrenheit: ");
	double initialTemp = input.nextDouble();
	System.out.print("Enter the final temperature in Fahrenheit: ");
	double finalTemp = input.nextDouble();
	initialTemp = (initialTemp-32)/1.8;
	finalTemp = (finalTemp-32)/1.8;
	double energy = gram*(finalTemp - initialTemp)*4184;
	System.out.println("The energy needed is "+energy+" joule");
    }
    
}
