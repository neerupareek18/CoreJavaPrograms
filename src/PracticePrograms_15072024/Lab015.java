package PracticePrograms_15072024;

public class Lab015 {
    public static void main(String[] args) {
        // Unary Operator ---- only 1 operand, +, -, !, ~, ^
        int age = +65; //unary +
        int lambo = -1; //unary minus
        System.out.println(age);
        System.out.println(lambo+2); // not changing the value of lambo, only adding 2 while displaying
       // System.out.println(++55); -- not possible, ++,-- always on operand variable, not literal
        System.out.println(++age);
        System.out.println(lambo--);   // ------- -1


    }
}
