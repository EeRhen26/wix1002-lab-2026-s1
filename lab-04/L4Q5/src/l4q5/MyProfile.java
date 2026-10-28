/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q5;

/**
 *
 * @author tanee
 */
import java.util.Random;
import java.util.Scanner;
public class MyProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random dice = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("DICE GAME");
        System.out.println("They should be two players");
        System.out.print("Enter player 1 name: ");
        String name1 = input.nextLine();
        System.out.print("Enter player 2 name: ");
        String name2 = input.nextLine();
        System.out.println("Let the games begin!\n");
        int rounds = 1,dice1 = 0, dice2 = 0, sum1 = 0, sum2 = 0;
        while (sum1 < 100 && sum2 <100){
            System.out.println("ROUND "+rounds);
            System.out.println(name1+"'s turn: ");
            dice1 = dice.nextInt(6)+1;
            System.out.println(name1 + " got "+ dice1 +" !");
            sum1 = sum1 + dice1;
            while(dice1 == 6){
                System.out.println(name1+" gets to roll again!");
                dice1 = dice.nextInt(6)+1;
                System.out.println(name1 + " got "+ dice1 +" !");
                sum1 = sum1 + dice1;
            }
            System.out.println(name1 + " now has " + sum1 + " points!");
            if(sum1 >= 100){
                break;
            }
            System.out.println(name2+"'s turn: ");
            dice2 = dice.nextInt(6)+1;
            System.out.println(name2 + " got "+ dice2 +" !");
            sum2 = sum2 + dice2;
            while(dice2 == 6){
                System.out.println(name2+" gets to roll again!");
                dice2 = dice.nextInt(6)+1;
                System.out.println(name2 + " got "+ dice2 +" !");
                sum2 = sum2 + dice2;
            }
            System.out.println(name2 + " now has " + sum2 + " points!\n");
            rounds = rounds + 1;
        }
        System.out.println("\n\n");
        if(sum1 > sum2){
            System.out.println(name1 + " wins!");         
        }
        else{
            System.out.println(name2 + " wins!");
        }
    }
    
}
