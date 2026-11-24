package l6q5;

import java.util.Scanner;
import java.util.Random;
public class MyProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random dice = new Random ();
        int num1 = 0, num2 = 0, user = 0, score = 0;
        boolean determine;
        while(user >=0){
            System.out.println("Enter negative number to quit.");
            num1 = dice.nextInt(13);
            num2 = dice.nextInt(13);
            System.out.print(num1+" x "+num2+" = ");
            user = input.nextInt();
            determine = check(num1, num2, user);
            if(determine){
                score++;
            }
        }
        System.out.println("Your Score is "+ score);
    }
    public static boolean check(int a, int b, int c){
        if(c==(a*b)){
            return true;
        }
        else{
            return false;
        }
    }
}
