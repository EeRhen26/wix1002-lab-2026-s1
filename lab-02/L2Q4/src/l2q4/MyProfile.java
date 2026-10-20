/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;

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
        Scanner input = new Scanner (System.in);
	System.out.print("Enter the number of seconds: ");
	int userIn = input.nextInt();
	int hours = userIn/(60*60);
	int minutes = userIn-(hours*(60*60));
	minutes = minutes/60;
	int seconds = userIn % 60;
	System.out.println(userIn + " seconds is " +hours+" hours, "+minutes+" minutes and " + seconds+" seconds.");
    }
    
}
