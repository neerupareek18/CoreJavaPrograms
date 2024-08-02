package LiveClassPrograms_27072024;

import java.util.Scanner;

public class Lab139 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            int i = s.nextInt();
            double d = s.nextDouble();
            char c = s.next().charAt(0);
            s.nextLine(); //scanner not taking the string input without this line. Why??
            String s1 = s.nextLine();

            System.out.println(s1);
            System.out.println(i);
            System.out.println(d);
            System.out.println(c);

    }
}
