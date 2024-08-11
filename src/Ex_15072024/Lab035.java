package Ex_15072024;
import java.lang.Math; //-----------------------Importing the library

public class Lab035 {
    public static void main(String[] args) {
        // Max between two numbers
        int a= 10;
        int b= 20;
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println(max);
        System.out.println(min);

        //--------------------------------------------
        //Using Math library -- Import it first

        double sq = Math.sqrt(2);
        int result = Math.max(10,23);
        System.out.println(sq);
        System.out.println(result);

    }
}
