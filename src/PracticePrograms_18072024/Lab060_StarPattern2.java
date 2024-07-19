package PracticePrograms_18072024;

import java.util.Scanner;

public class Lab060_StarPattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the number of lines you want to print");
        int n = s.nextInt();
        for(int i =0; i<=n*2-2; i=i+2){
            for(int j=n*1+(n-1); j>i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

//3 -- 4 3*2-2   n*2-2
//4 -- 6
//5 -- 8

/*
2 -- 3 2*1+1    n*1+(n-1)
3 -- 5 3*1+2
4 -- 7 4*1+3
5 -- 9
 */
