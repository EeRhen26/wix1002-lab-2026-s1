/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q2;

import java.util.Random;

/**
 *
 * @author tanee
 */
public class MyProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random num = new Random ();
        int [] array = new int [10];
        for (int i = 0; i<array.length ;i++){
            array[i] = num.nextInt(21);
            for(int j = i-1; j>=0;j--){
                if(array[i]==array[j]){
                    i=i-1;
                    break;
                }
            }
        }
        for(int i=0;i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    
}
