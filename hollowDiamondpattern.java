import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num =  scn.nextInt();
        int outerspace = num/2;
        int innerspace = -1;
        for(int i=1;i<=num;i++) {
            for(int j=1;j<=outerspace;j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int j =1 ; j <=innerspace; j++) {
                System.out.print("\t");
            }
            if(i > 1 && i < num){
                System.out.print("*\t");
            }
            
            if(i<=num/2) {
                outerspace--;
                innerspace += 2;
            }
            else {
                outerspace++;
                innerspace -= 2;
            }
            System.out.println();
        }
    }
}
