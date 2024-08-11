package Ex_15072024;

public class Lab020 {
    public static void main(String[] args) {
        //Logical Operators: -- OR ||, AND &&, NOT !
        //Compare Operator == --> result in boolean
        //= Assignment Operator

        //OR - if any one is true then result is true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //AND - if any one is false, result is false
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //NOT
        int a = 12;
        boolean b = !(a > 10 || a < 5); // BODMAS
        System.out.println(b);
        // BODMAS stands for
        // Bracket, Of, Division,
        // Multiplication, Addition, and Subtraction.

        //==
        int a1  = 10; // assign the values.
        boolean b1 = (10 == 11); // == Compare between the two values - True/False
        // === NOT PRESENT in the JAVA, === present Javascript
        System.out.println(a1);
        System.out.println(b1);
    }
}
