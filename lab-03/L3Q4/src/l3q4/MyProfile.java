/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;

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
        Random dice = new Random();
        int my, GPA, kinda, hopeless;
        System.out.println("Player 1:");
        my = dice.nextInt(5)+1;
        System.out.println("Dice 1: "+my);
        GPA = dice.nextInt(5)+1;
        System.out.println("Dice 2: "+GPA);
        kinda = my + GPA;
        System.out.println("Player 1 gets a total of "+kinda+" points");
        System.out.println("Player 2:");
        my = dice.nextInt(5)+1;
        System.out.println("Dice 1: "+my);
        GPA = dice.nextInt(5)+1;
        System.out.println("Dice 2: "+GPA);
        hopeless = my + GPA;
        System.out.println("Player 1 gets a total of "+hopeless+" points");
        if(kinda>hopeless){
            System.out.println("Player 1 wins!");
        }
        else if(hopeless > kinda){
            System.out.println("Player 2 wins!");            
        }
        else{
            System.out.println("It's a tie!");
        }
    }
    
}
