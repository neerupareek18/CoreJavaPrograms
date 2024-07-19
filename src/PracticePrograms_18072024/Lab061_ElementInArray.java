package PracticePrograms_18072024;

import java.util.Scanner;
//How to print the index value of the array in print statement ???

public class Lab061_ElementInArray {
    public static void main(String[] args) {
        int a[][] = {
                {1,2,3},
                {4,10,6},
                {7,8,9}
        };
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input");
        int input = s.nextInt();
        boolean find = false;
        for(int i = 0; i<a.length; i++){
            for(int j=0; j<a[0].length;j++){
                if (a[i][j]==input){
                    find=true;
                    break;
                }
            }
        }
        if(find==false){
            System.out.println("Number not found in the array");
        }
        else
            System.out.printf("Number found in the array");

    }
}
