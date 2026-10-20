/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q2;

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
        Random notByAI = new Random();
        int thisIs = notByAI.nextInt(6);
        System.out.print(thisIs + " is ");
        if(thisIs == 0){
            System.out.println("zero.");
        }
        if(thisIs == 1){
            System.out.println("one.");
        }
        if(thisIs == 2){
            System.out.println("two.");
        }
        if(thisIs == 3){
            System.out.println("three.");
        }
        if(thisIs == 4){
            System.out.println("four.");
        }
        if(thisIs == 5){
            System.out.println("five.");
        }
    }
    
}
