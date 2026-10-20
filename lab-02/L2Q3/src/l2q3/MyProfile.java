/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

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
	int num1 = g.nextInt(41)+10;
	System.out.println("The first random number is "+num1);
	int num2 = g.nextInt(41)+10;
	System.out.println("The second random number is "+num2);
    int num3 = g.nextInt(41)+10;
	System.out.println("The third random number is "+num3);
	int sum = num1 + num2 + num3;
	double ave = (double)sum;
	ave = ave/3;
	System.out.println("The sum of three numbers is "+sum+" while the average is ");
	System.out.printf("%.2f%n",ave);
    }
    
}
