/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q7;

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
        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter interest in %: ");
        double rate = input.nextDouble();
        System.out.print("Enter number of month(s): ");
        int month = input.nextInt();
        System.out.println("Month\tMonthly Payment Principal\tInterest\tUnpaid Balance\tTotal Interest");
        double monthlyPay = 0, interest = 0, principalDue = 0, balance = 0, totalInterest = 0;
        for(int i = 1; i<=month; i++){
            System.out.print(i+"\t");
            //calculate monthly payment
            monthlyPay = (principal*rate/1200)/(1-Math.pow(1+rate/1200,-month));
            System.out.printf("%.2f\t\t",monthlyPay);
            principalDue = monthlyPay * Math.pow((1+rate/1200),-(1+month-i));
            System.out.printf("%.2f\t\t",principalDue);
            interest = monthlyPay - principalDue;
            System.out.printf("%.2f\t\t",interest);
            balance = interest/(rate/1200)-principalDue;
            System.out.printf("%.2f\t\t",balance);
            totalInterest = totalInterest + interest;
            System.out.printf("%.2f\n",totalInterest);
        }
    }
    
}
