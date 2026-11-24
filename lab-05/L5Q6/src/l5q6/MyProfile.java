package l5q6;
import java.util.Scanner;
public class MyProfile {
    public static void main(String[] args) {
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        System.out.println("The Pascal Triangle with "+user+" row(s)");
        int [][] triangle = new int [user][user];
        for(int i = 0; i<user; i++){
            for(int j = 0; j<user; j++){
                triangle[i][j] = 0;
                if(j==0){
                    triangle[i][j] = 1;
                }
            }
        }
        triangle[0][0] = 1;
        if(user>1){
            for(int i = 1; i<user; i++){
                for(int j = 1; j<user; j++){
                    if(triangle[i-1][j-1] >= 1 && triangle[i-1][j]>=1){
                        triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                    }
                    else if(triangle[i-1][j] == 1 || triangle [i-1][j-1] == 1){
                        triangle[i][j] = 1;
                    }
                }
            }
        }
        for(int i =0; i<user; i++){
            for(int j = 0; j<user; j++){
                System.out.print(triangle[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
