package PracticePrograms_17072024;

import java.util.Scanner;

public class Lab045_Switch1 {
    public static void main(String[] args) {
        //Switch:
        // can accept byte, short, int,long, enum, String, char
        //Float, double is not allowed
        //Expressions are allowed

        //Duplicate case statements are not allowed
        //yield is used to return the value
        //Use of break, without break
        //default can be used anywhere, break is required if it is not the last statement
        // -> is also used, break is not required in this case

        String input;
        int a;
        int b;
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);

        System.out.println("Enter first number");
        a = s2.nextInt();
        System.out.println("Enter second number");
        b = s3.nextInt();
        System.out.println("What action do you want to perform");
        input = s1.nextLine();

//        float result = switch(input);
//        switch(input)
//        {
//            case "Sum":
//                System.out.println("This is an addition program");
//                System.out.println(a+b);
//                yield (a+b);
//            case "Sub":
//                System.out.println("This is an subtraction program");
//                System.out.println(a-b);
//                yield (a-b);
//        }

        //Yield is not working -- Giving the error


    }
}
