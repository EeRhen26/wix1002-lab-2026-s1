/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q8;

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
        Random num = new Random();
        int n = num.nextInt(101);
        System.out.println("The number is "+n);
        System.out.println("The first "+n+" prime numbers are: ");
        int number = 2, counter = number - 1;
        int i = 0;
        while(i < n){
            while(number%counter != 0){
                counter = counter - 1;
            }
            if(counter == 1){
                System.out.println(number);
                i = i+1;
                number = number + 1;
                counter = number - 1;
            }
            else{
                number = number + 1;
                counter = number - 1;
            }
        }
    }
    
}
