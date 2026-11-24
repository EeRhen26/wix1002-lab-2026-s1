/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q5;

import java.util.Random;
import java.util.Scanner;
public class MyProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random dice = new Random();
        System.out.println("A list of 20 random integer within 0 to 100");
        int [] numbers = new int [20];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = dice.nextInt(101);
            System.out.print(numbers[i]+" ");
        }
        System.out.println("");
        System.out.println("Array in descending order");
        int hold = 0;
        for(int pass = 1; pass < numbers.length; pass++){
            for(int i = 0; i < (numbers.length - 1); i++){
                if(numbers[i]<numbers[i+1]){
                    hold = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = hold;
                }
            }
        }
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println("");
        System.out.print("Enter a number to search: ");
        int user = input.nextInt();
        boolean check = true;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == user){
                System.out.println(user+" found");
                System.out.println("Linear search - "+(i+1)+" loops");
                check = false;
            }
        }
        if (check){
            System.out.println("Number not found");
        }
        int low = 0;
        int high = numbers.length - 1;
        int middle, search = 1;
        while(low <= high){
            middle = (low+high) /2;
            if(user == numbers[middle]){
                System.out.println(user+" found");
                System.out.println("Binary search - "+search+" loops");
                break;
            }
            else if(user > numbers[middle]){
                high = middle - 1;
                search ++;
            }
            else{
                low = middle + 1;
                search ++;
            }
        }
        if (low>high){
            System.out.println("Number not found");
        }
    }
    
}
