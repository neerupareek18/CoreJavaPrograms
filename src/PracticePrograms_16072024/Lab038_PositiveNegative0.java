package PracticePrograms_16072024;
import java.util.Scanner;
public class Lab038_PositiveNegative0 {
    public static void main(String[] args) {
        //Positive, Negative or 0
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number input");
        int i = s.nextInt();
        if (i>0)
            System.out.println("Positive Number");
        else if (i<0)
            System.out.println("Negative Number");
        else
            System.out.println("Number is '0'");
    }
}
