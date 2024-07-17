package PracticePrograms_16072024;
import java.util.Scanner;

public class Lab048_Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int input = s.nextInt();
        int factorial = 1;
        for(int i = input; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.printf("Factorial of %d is %d",input,factorial);
        s.close();
    }
}
