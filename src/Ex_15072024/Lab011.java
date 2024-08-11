package Ex_15072024;

public class Lab011 {
    public static void main(String[] args) {
//        int a = 10;
//        int b= 34;
//        System.out.println(a+b);
//
//        String s1 = "PRamod";
//        String s2 = "Dutta";
//        System.out.println(s1+s2);

        String s3 = "Amit";
        int x = 99;
        int y = 100;

//        System.out.println(x+y+s3);
//        System.out.println(s3+x+y);
//        System.out.println(x+s3+y);


        System.out.println(x+y+s3+y+s3+x+y);
        System.out.println(x+y+s3+y+s3+(x+y));

        char c1 = 'A'; //ASCII value 65
        char c2 = 'B'; //ASCII value 66
        //Result in int result not String
        int c3 = c1+c2;
        System.out.println(c3);
    }
}
