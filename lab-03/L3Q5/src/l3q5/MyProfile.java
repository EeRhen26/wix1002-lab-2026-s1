/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q5;

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
        double a, b, c, d, e, f, x, y;
        System.out.print("Enter value of a: ");
        a = input.nextDouble();
        System.out.print("Enter value of b: ");
        b = input.nextDouble();
        System.out.print("Enter value of c: ");
        c = input.nextDouble();
        System.out.print("Enter value of d: ");
        d = input.nextDouble();
        System.out.print("Enter value of e: ");
        e = input.nextDouble();
        System.out.print("Enter value of f: ");
        f = input.nextDouble();
        if(a * d - b * c == 0){
            System.out.println("The equation has no solution");
        }
        else{
            x = (e*d-b*f)/(a*d-b*c);
            y = (a*f-e*c)/(a*d-b*c);
            System.out.printf("x = %.5f%n",x);
            System.out.printf("y = %.5f%n",y);
        }
    }
    
}
