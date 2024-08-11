package Ex_27072024;

import java.util.Arrays;

public class Lab127 {
    public static void main(String[] args) {
//Arrays -- Homogeneous elements with Contiguous memory, Continuous memory location

        int a[] = new int[10];    //Non-Primitive Data Type --> String, Class, Enums
        int[] a1 = {10,20,45,50};

        //System.out.println(a1[-1]);        //-1 doesn't exists -- out of bound error

        String A1[] = new String[7];
        System.out.println(A1[0]);  //Default value will be assigned as there is new operator

        Integer a3[] = new Integer[5];
        a3[0] = 1;
        a3[1] = 2;
        System.out.println(Arrays.toString(a3));

        float f[] = {10,50,70};
        System.out.println(Arrays.toString(f));

        //the names should be in camel case but it won't give any error -- neerMarks

        //--------------------------------------------------------------------------------------------



    }
}
