package l6q3;

import java.util.Scanner;
public class MyProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number into array: ");
        int [] user = new int [10];
        for(int i = 0; i<user.length; i++){
            user[i] = input.nextInt();
        }
        int [] answer = reverser(user);
        System.out.println("");
        for(int i = 0; i<answer.length; i++){
            System.out.print(answer[i]+" ");
        }
        System.out.println("");
    }
    public static int[] reverser(int[] num){
        //assuming that the array we received is with 10 elements
        int [] ans = new int [10];
        for(int i = 0; i<num.length; i++){
            ans[i] = num[9-i];
        }
        return ans;
    }
}
