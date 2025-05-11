package Threedarray;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int b[][][] = new int[2][2][2];
        
        System.out.println("Enter 8 integers:");

       
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    b[i][j][k] = abc.nextInt();
                }
            }
        }
        
        System.out.println("The 3D array elements are:");
        
       
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(b[i][j][k] + " ");
                }
                System.out.println(); // Newline after each row
            }
            System.out.println(); // Newline after each 2D slice
        }

     
    }
}
