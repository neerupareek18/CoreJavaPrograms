package SelfPacedEx_24072024;

import java.util.Arrays;

public class Lab107_MergeSort {
    public static void main(String[] args) {
        int arr1[] = {-1,5,3,5,2};
int arr2[] = {0,1,4,2,90,1};
int arr3[] = new int[11];
Arrays.sort(arr1);
Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

int i =0;
int j=0;
int k=0;

while(i<arr1.length && j<arr2.length){
    if(arr1[i]<arr2[j]){
        arr3[k]=arr1[i];
        i++;
        k++;
    }
    else{
        arr3[k]=arr2[j];
        j++;
        k++;
    }
}
if(i==arr1.length){
    while(j<arr2.length){
        arr3[k]=arr2[j];
        j++;
        k++;
    }
}

        if(j==arr2.length){
            while(i<arr1.length){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
        }

        System.out.println(Arrays.toString(arr3));


    }
}
