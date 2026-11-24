/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q1;

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
        int students = 0, highest = 0, lowest = 0, sum = 0;
        System.out.print("Enter the number of students: ");
        students = input.nextInt();
        int [] marks = new int [students];
        for(int i = 0; i < students; i++){
            marks[i] = num.nextInt(101);
            System.out.println(marks[i]);
            sum = sum + marks[i];
            if(i==0){
                highest = marks[i];
                lowest = marks[i];
            }
            else{
                if(marks[i]>highest){
                    highest = marks[i];
                }
                else if(marks[i]<lowest){
                    lowest = marks[i];
                }
            }
        }
        double ave = (double)sum / students;
        System.out.println("The highest mark is "+highest+";");
        System.out.println("The lowest mark is "+lowest+";");
        System.out.printf("The average is %.2f%n",ave);
    }
    
}
