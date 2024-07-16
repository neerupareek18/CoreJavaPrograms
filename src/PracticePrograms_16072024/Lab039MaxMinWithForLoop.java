package PracticePrograms_16072024;

public class Lab039MaxMinWithForLoop {
    public static void main(String[] args) {
        //largest in 3 numbers
        int a1[] = {-10, -15, -20};
        int a = -10;
        int b = -15;
        int c = -20;
        int max=a1[0];
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] >= max) {
                max = a1[i];
            }
        }
        System.out.println("Max Number -->"+max);

        //minimum of three numbers:
        int min=a1[0];
        for (int i =0; i<a1.length; i++){
            if (a1[i]<=min){
                min = a1[i];
            }
        }
        System.out.println("Min Number -->"+min);
    }
}
