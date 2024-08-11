package Ex_27072024;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float marks[] = new float[5];
        for (int i = 0; i<marks.length; i++){
            marks[i] = s.nextFloat();
        }
        float sum =0;
        for (int i = 0; i<marks.length; i++){
            sum = sum+marks[i];
        }
        System.out.println("Average--"+ (sum/marks.length));
s.close();
    }
}
