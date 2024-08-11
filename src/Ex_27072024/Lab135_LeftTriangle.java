package Ex_27072024;

import java.util.Scanner;

public class Lab135_LeftTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows");
        int n = s.nextInt();
        for(int i =n; i>0; i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
