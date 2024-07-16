package PracticePrograms_16072024;

import java.util.Scanner;

public class Lab036 {
    public static void main(String[] args) {
        //Grade Cal:
        /*
        90-100 --> A
        70-90 --> B
        50-70 --> C
        40-50 --> D
        <40 -->E
         */
        System.out.println("Enter your Name:");
        Scanner s = new Scanner(System.in);
        String c = s.next();
        System.out.println("Enter your marks");
        Scanner s1 = new Scanner(System.in);
        int i = s1.nextInt();

        if(i>=90 && i<=100)
            System.out.println("Grade --> A");
        else if (i>=70 && i<=90)
            System.out.println("Grade --> B");
        else if (i>=50 && i<=70)
            System.out.println("Grade --> C");
        else if (i>=40 && i<=50)
            System.out.println("Grade --> D");
        else if (i<40)
            System.out.println("Grade --> E");
        else
            System.out.println("Input not within the range");
    }
}
