package Ex_15072024;

public class Lab014 {
    public static void main(String[] args) {
        String s1 = null;
        System.out.println(s1);

        // Operators
        int age = 65; // 10000001 -> switch of / on
        // = Assignment Operator - Assign the value literal to the ref of data type

        // Arithmetic Operator +,-,/,*,
        // %
        int a = 10;
        int b = 23;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); //integer
        System.out.println((float) (a/b)); // ----------- why 0.0, why not 0.434
        //a/b will calculate the number only in integet (float) is just to display that integer as floating value
        System.out.println((float)a/(float)b); // ---- 0.434....
        System.out.println(a/(float)b);
        System.out.println((float)a/b);
        // %
        System.out.println(a%b); // Remainders


    }


}
