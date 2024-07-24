package SelfPacedEx_24072024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab105_BinarySearch {
    public static void main(String[] args) {
        int arr[] = {-2,-1,0,1,2,3,4,5,6,7,8,9,10};
        int number = 9;
        boolean result = false;
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;


        while(low<=high){
            if(number<arr[mid]){
                high = mid-1;
                mid = (low+high)/2;
            }
            else if (number>arr[mid]){
                low = mid+1;
                mid = (low+high)/2;
            }
             else if (number == arr[mid]){
                 result = true;
                break;
            }
        }
        if(result){
            System.out.println("Number is at index -->"+mid);
        }
        else System.out.println("Number not in the list");
    }

}
