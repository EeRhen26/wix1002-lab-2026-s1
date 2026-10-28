/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q4;

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
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter first day of the year:");
        System.out.println("0 for Sunday");
        System.out.println("1 for Monday");
        System.out.println("2 for Tuesday");        
        System.out.println("3 for Wednesday");
        System.out.println("4 for Thursday");
        System.out.println("5 for Friday");
        System.out.println("6 for Saturday");
        int day = input.nextInt();
        if(day<0 || day>7){
            System.out.println("\n\n");
            System.out.println("Fatal Error");
        }
        else{
            System.out.println("\n\n");
            System.out.println("Year "+year);
            boolean leap;
            if(year%4 == 0){
                leap = true;
            }
            else{
                leap = false;
            }
            /*calculation done via diving the days til May by 7
            Then use it to calculate day at 1st of May*/
            int daysTilMay = 0, daysTilAug = 0;
            if(leap){
                daysTilMay = day + 121;
                daysTilAug = day + 213;
            }
            else{
                daysTilMay = day + 120;
                daysTilAug = day + 212;
            }
            int countMay = daysTilMay % 7;      //used to calculate first day of May
            int countAug = daysTilAug % 7;      //used to calculate first day of Aug
            int spaceCount = 0;                 //used to count how many tabs needed for calendar
            System.out.println("");
            System.out.println("MAY");
            System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
            spaceCount = countMay;
            for(int i = 0; i < spaceCount; i++){
                System.out.print("\t");
            }
            for(int j = 1; j <= 31; j++){
                System.out.print(j+"\t");
                countMay = countMay + 1;
                if (countMay >= 7){
                    System.out.println("");
                    countMay = 0;
                }
            }
            System.out.println("");
            System.out.println("\n\nAUGUST");
            System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
            spaceCount = countAug;
            for(int i = 0; i < spaceCount; i++){
                System.out.print("\t");
            }
            for(int j = 1; j <= 31; j++){
                System.out.print(j+"\t");
                countAug = countAug + 1;
                if (countAug >= 7){
                    System.out.println("");
                    countAug = 0;
                }
            }
            System.out.println("");
        }
    }
}
