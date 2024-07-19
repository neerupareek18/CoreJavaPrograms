package PracticePrograms_18072024;

import java.util.Arrays;

public class Lab057_DoubleValueOfArray {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int a1[]=new int[3];

        for (int i =0; i<a.length;i++){
            a1[i]=2*a[i];
        }
        for (int i =0; i<a1.length;i++){
            System.out.println(a1[i]);
        }
        System.out.println(Arrays.toString(a1)); //Printing the Array in array format

    }
}
