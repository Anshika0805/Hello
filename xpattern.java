/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num =  scn.nextInt();
        for(int i = 1; i<=num ;i++) {
            for(int j = 1; j <= num ; j++) {
                if(i==j || i+j == num+1) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
Mthd 2 : to make a single point of intersection there should be odd rows hence multiply rows by 2 and subtract 1.
    
    import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num =  scn.nextInt();
        int k = 2*num-1;
        for(int i = 1; i<=k ;i++) {
            for(int j = 1; j <= k; j++) {
                if(i==j || j+i == k+1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
