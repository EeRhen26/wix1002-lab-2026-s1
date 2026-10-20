/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;

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
        System.out.print("Enter sales volume: ");
        int volume =  input.nextInt();
        System.out.print("Enter total sales: ");
        double totalSales = input.nextDouble();
        double commision;
        if(volume <= 100){
            commision = 0.05;
        }
        else if(volume <= 500){
            commision = 0.075;
        }
        else if(volume <= 1000){
            commision = 0.10;
        }
        else{
            commision = 0.125;
        }
        totalSales = totalSales * commision;
        System.out.print("Commision is: RM");
        System.out.printf("%.2f%n",totalSales);
    }
    
}
