package LiveClassPrograms_15072024;

public class Lab034 {
    public static void main(String[] args) {
        //  Ternary operator.
        //  ? if true do this : ele do that
//        int result = 10>40 ? 89 : 91;
//        System.out.println(result);
        int a1 = (30>40) ? 10: 20;
        System.out.println(a1);

        String str= 10 > 20 ? "10" : "TWENTY";
        System.out.println(str);
        char c1 ='A';
        char c2 = 'B';

        float f = (10>20)?(c1=c2):(c2='7');
        System.out.println(c1);
        System.out.println(c2);


    }
}
