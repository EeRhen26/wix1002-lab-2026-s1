/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;

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
        System.out.print("Enter the radius of circle (in integer): ");
        int radius = input.nextInt();
        System.out.print("Enter x-coordinate(in integer): ");
        int x = input.nextInt();
        System.out.print("Enter y-coordinate(in integer): ");
        int y = input.nextInt();
        System.out.print("The coordinates ("+x+","+y+") is");
        if (x < 0){
            x = (0-x);      
        }
        if (y < 0){
            y = (0-y);
        }
        //locus of circle : x^2 + y^2 - radius^2 = 0, try case in desmos
        if( ( (x^2) + (y^2) - (radius^2) ) <= 0){
            System.out.print(" ");
        }
        else{
            System.out.print(" not ");
        }
        System.out.println("in the circle centered at (0,0) with radius "+radius);
    }
    
}
