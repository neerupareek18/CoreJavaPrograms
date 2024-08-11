package Ex_15072024;

public class Lab010 {
    public static void main(String[] args) {
        byte b = 127;
        b+=1;
        System.out.println(b);
        //b=b+1 ; not possible as 1 is integer that cannot be stored in byte variable
        //Explicit casting
        b =  (byte)(b+ (byte) (1));
        b= (byte) (b+1);
        System.out.println(b);

        //We cannot change the data type of an variable in middle of the program
        //Variable name cannot start with number, there can be alphabet, _, $
        int _123 = 987;
        System.out.println(_123);

    }
}
