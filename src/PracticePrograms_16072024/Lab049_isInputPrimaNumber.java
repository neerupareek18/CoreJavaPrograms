package PracticePrograms_16072024;
import java.util.Scanner;

public class Lab049_isInputPrimaNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = s.nextInt();
        int multiple = 0;

        for(int i = 1; i<=input; i++){
            if(input%i==0){
                multiple++;
            }
        }
        if(multiple>2){
            System.out.println(input +"-->It is not a prime number");
        }
        else System.out.println(input +"-->It is a prime number");

    }
}
