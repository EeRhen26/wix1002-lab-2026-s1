/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tanee
 */
public class MyProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random num = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int user = input.nextInt();
        int [] array = new int [user];
        int sum = 0, dice = 0;
        for(int i = 0; i<array.length; i++){
            sum = 0;
            System.out.println("Employee "+(i+1)+" :");
            for (int j = 0; j<7;j++){
                dice = num.nextInt(8) + 1;
                System.out.print(dice+" ");
                sum = sum + dice;
            }
            array[i] = sum;
            System.out.println("\nTotal work hours: "+array[i]);
        }
    }
    
}
