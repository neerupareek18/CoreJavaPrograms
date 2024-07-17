package PracticePrograms_17072024;

import java.util.Scanner;

public class Lab051_HackerRank1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        double d = scan1.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        String s = scan2.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
        scan1.close();
        scan2.close();
    }
}
