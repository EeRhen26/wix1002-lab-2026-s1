/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q3;

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
        double sum = 0,sumSquared = 0, userInput = 0, count = 0, lowest, highest;
        System.out.print("Enter a score[negative score to quit] : ");
        userInput = input.nextDouble();
        highest = userInput;
        lowest = userInput;
        count = count + 1;
        if(userInput >= 0){
            sum = sum + userInput;
            sumSquared = sumSquared + Math.pow(userInput,2);
         } //used to determine highest and lowest points
        if(userInput>=0){           //if statement used just in case user enters negative on first input
            while (userInput >= 0){
                System.out.print("Enter a score[negative score to quit] : ");
                userInput = input.nextDouble();
                if(userInput >= 0){
                    count = count + 1;
                    sum = sum + userInput;
                    sumSquared = sumSquared + Math.pow(userInput,2);
                    if(userInput > highest){
                        highest = userInput;
                    }
                    else if(userInput < lowest){
                        lowest = userInput;
                    }
                }
            }
        }
        double variance = sumSquared - (Math.pow(sum,2)/count);
        variance = variance/(count-1);
        System.out.printf("%.2f%n",variance);
        System.out.printf("Minimum score: %.2f%n",lowest);
        System.out.printf("Maximum score: %.2f%n",highest);
        double ave = sum/count;
        System.out.printf("Average score: %.2f%n",ave);
        double deviation = Math.sqrt(variance);
        System.out.printf("Standard deviation: %.2f%n",deviation);
    }
    
}
