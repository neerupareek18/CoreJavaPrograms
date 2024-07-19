package PracticePrograms_18072024;

public class Lab056_MaxMinInArray {
    public static void main(String[] args) {
        int a[] = {-1,-2,-3,4,-5,-7};
        int max = a[0];
        for (int i:a){
           if(i>max){
               max=i;
           }
        }
        System.out.println("Max:"+max);
        int min = a[0];
        for (int i:a){
            if(i<min){
                min=i;
            }
        }
        System.out.println("Min:"+min);

        //Assigning Integer Minimum / max value
        int integer = Integer.MIN_VALUE;
        System.out.println(integer);
        integer = Integer.MAX_VALUE;
        System.out.println(integer);

    }
}
