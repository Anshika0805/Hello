/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num =  scn.nextInt();
        int st = 1;
        int sp = 0;
        for(int i = 1; i<=num ;i++) {
            
            for(int j = 1; j <= sp ; j++) {
                System.out.print("\t");
            }
            for(int k =1; k <= st;k++) {
                System.out.print("*");
            }
            System.out.println();
            sp++;
                
        }
    }
}
