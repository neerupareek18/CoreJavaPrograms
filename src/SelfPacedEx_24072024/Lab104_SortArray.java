package SelfPacedEx_24072024;

import java.util.Arrays;

public class Lab104_SortArray {
    public static void main(String[] args) {
        int arr[] = {1,4,2,6,8,9,10,3,-1,-2};
        int temp;
        for(int i =0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
