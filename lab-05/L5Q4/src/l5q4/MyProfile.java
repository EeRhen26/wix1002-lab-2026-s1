/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q4;

/**
 *
 * @author tanee
 */
public class MyProfile {
    public static void main(String[] args) {
        System.out.println("3 by 3 Matrix");
        int [][] matrix = {{1,5,7},{3,6,9},{5,3,8}};
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("After rotates 90 degrees clockwise: ");
        int [][] rotate = {{5,3,1},{3,6,5},{8,9,7}};
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(rotate[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
