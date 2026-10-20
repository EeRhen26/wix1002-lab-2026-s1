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
        System.out.print("Enter the radius of circle centered at (0,0) in integer: ");
        int radius = input.nextInt();
        System.out.print("Enter the x-coordinate in integer: ");
        int x = input.nextInt();
        System.out.print("Enter the y-coordinate in integer: ");
        int y = input.nextInt();
        System.out.print("The coordinates ("+x+","+y+(") is "));
        if( (x*x + y*y) <= Math.pow(radius, 2)){
            System.out.print("inside ");         
        }
        else{
            System.out.print("outside ");
        }
        System.out.println("the circle centered at (0,0)");
    }
    
}
