/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q1;

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
        System.out.print("Enter a integer: ");
        int need = input.nextInt();
        System.out.print("Enter another integer: ");
        int sleep = input.nextInt();
        System.out.print("Enter a character(+,-,*,/ or %): ");
        char symbol = input.next().charAt(0);
        if (symbol == '+')
        {
            int I;
            I = need + sleep;
            System.out.println("The result of "+need+" "+symbol+" "+sleep+" is "+I);
        }
        else if (symbol == '-'){
            int I;
            I = need - sleep;
            System.out.println("The result of "+need+" "+symbol+" "+sleep+" is "+I);
        }
        else if(symbol == '*'){
            int I;
            I = need * sleep;
            System.out.println("The result of "+need+" "+symbol+" "+sleep+" is "+I);
        }
        else if(symbol == '/'){
            double I;
            I = (double)need / sleep;
            System.out.print("The result of "+need+" "+symbol+" "+sleep+" is ");
            System.out.printf("%.2f%n",I);
        }
        else if (symbol == '%'){
            int I;
            I = need % sleep;
            System.out.println("The result of "+need+" "+symbol+" "+sleep+" is "+I);
        }
        else{
            System.out.println("Error");
        }
    }
    
}
