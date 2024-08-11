package Ex_27072024;

import java.util.Arrays;

public class Lab131 {
    public static void main(String[] args) {
//find the max in the array
        int a[] = {20,10,90,40,50,20};
        int max=Integer.MIN_VALUE;
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max-->"+max);
        //or
        Arrays.sort(a);
        System.out.println("Max-->"+a[a.length-1]);
    }
}
