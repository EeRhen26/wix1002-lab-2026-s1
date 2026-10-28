/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q2;

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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = input.nextInt();
        int counter = 0, sum = 0;
        for(int i = 1; i<=userInput; i++){
            counter = counter + i;
            sum = sum + counter;
        }
        System.out.println("The sum for series is: "+sum);
    }    
}
