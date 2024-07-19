package PracticePrograms_18072024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab062_TransposeTheArray {
    public static void main(String[] args) {
        int a[][] = {
                {1,2,3},
                {4,10,6},
                {7,8,9}
        };
        int a1[][] = new int [3][3];

        for (int i=0; i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a1[j][i] = a[i][j];
            }
        }
        System.out.println(Arrays.deepToString(a1)); //Printing 2-d in array format -- deep
    }
}
