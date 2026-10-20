/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

/**
 *
 * @author tanee
 */

import java.util.Random;

public class MyProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random g = new Random();
	int num = g.nextInt(10001);
	System.out.println("The random number is "+num);
	int one = num%10;
	int ten = (num%100)/10;
	int hundred = (num%1000)/100;
	int thousand = (num%10000)/1000;
	int last = num/10000;
	int sum = one + ten + hundred + thousand + last;
	System.out.println("The sum of digits is: "+sum);
    }
    
}
