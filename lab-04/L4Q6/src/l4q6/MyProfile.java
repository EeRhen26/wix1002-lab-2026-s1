/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q6;

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
        Random num = new Random();
        int num2 = num.nextInt();
        num2 = Math.abs(num2);
        System.out.println("The number generated is "+num2);
        int digit = 1;
        double remainderChecker = 0, power = 0;
        while (digit > 0){
            power = Math.pow(10,digit);
            remainderChecker = (double)num2 % power;
            if (remainderChecker == (double)num2){
                break;
            }
            digit = digit + 1;
        }
        System.out.println("There are " +digit+ " digits in " +num2+ " .");
    }
}
