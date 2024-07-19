package LiveClassPrograms_15072024;

public class Lab009 {
    public static void main(String[] args) {
        // \ is the escape character used to perform any action
        /*
        \n -- new line
        \s -- space
        \b -- backslash one character
        \t -- tab
        \r == carriage return
         */
        char c = 'A';
        char c1 = '$';
        char c2 = '*';
        char c3 = '\u1F6A';
        String s1 = "Neeru\tPareek";
        String s2 = "Neeru\sPareek";
        String s3 = "Neeru\rPareek";
        String s4 = "Neeru\r";     // ------ Need to be clarified
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}
