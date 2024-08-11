package Ex_15072024;

public class Lab025 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        // A = a++ -> 10 , a = 11
        // +
        // B = a = 11 ->  A+B = 10+11
        //---------------------------------------------------
        int a1 = 10;
        System.out.println(a1++ + ++a1);
        System.out.println(a1);
        // A - a1++  -> Exp = 10 | a1 = 11
        // + - operator
        // B- a1++  -> Exp = 12 | a1 = 12
        //--------------------------------------------------
        int a2 = 10;
        System.out.println(++a2 + ++a2);
        System.out.println(a2);
        // A -> ++a2 , Exp = 11    |  a2 = 11
        // + -> nothing
        // B -> ++a2  Exp =  12 | a2 = 12
        // Exp = A+B = 23 , a2 = 12
        //----------------------------------------------------
        int a3 = 10;
        System.out.println(++a3 + a3++ + a3++);
        System.out.println(a3);
        //  Part ->  A -> ++a3 , Exp1 = 11 , a3 = 11
        //  Part ->  B -> a3++ , Exp2 = 11 , a3 = 12
        //  Part ->  C -> a3++, Exp3 = 12 , a3 = 13
        // op ->  exp1+ exp2+exp3
        // a3  = 13
    }
}
