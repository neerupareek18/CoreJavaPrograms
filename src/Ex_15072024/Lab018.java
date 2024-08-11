package Ex_15072024;

public class Lab018 {
    public static void main(String[] args) {
        // Relational Operators -> boolean
        //    // >, < >=,<=, == , != ( ! = ) - true or false.
        int a = 10;
        int b = 20;
        int sum = a+b; // operand a, b , operator =, +

        int age_mamitha = 34;
        int age_pramod = 34;
//        boolean result = age_pramod > age_mamitha;
//        boolean result = age_pramod < age_mamitha;
        boolean result2 = age_pramod >= age_mamitha; // OR gate
        System.out.println(result2);

        System.out.println( 10 == 10); // == Compare true values
        System.out.println( 10 >= 10); //  10> 10 or 10 = 10
        System.out.println( 10 <= 10); // 10 < 10 or 10 = 10
        System.out.println( 10 > 10);
        System.out.println( 10 < 10);
    }
}
