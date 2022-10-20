/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num =  scn.nextInt();
        int st = num-1;
        int sp = 1;
        for(int i = 1; i<=(2*(num-1))-1 ;i++) {
            
            for(int j = 1; j <= st ; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            
            for(int j=1; j <= st;j++) {
                System.out.print("*");
            }
            if(i< num-1) {
                st--;
                sp += 2;
            }
            else {
                st++;
                sp -= 2;
            }
            System.out.println();
        }
            
            
        
        
    }

}
