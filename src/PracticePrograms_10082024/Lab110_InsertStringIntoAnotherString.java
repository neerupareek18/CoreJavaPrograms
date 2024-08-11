package PracticePrograms_10082024;

public class Lab110_InsertStringIntoAnotherString {
    public static void main(String[] args) {
        String s1 = "My nme Neeru";
        String s2 = "is";
        StringBuilder s3 = new StringBuilder(s1);
        s3.insert(8, s2+" ");
        System.out.println(s3);

        String s4 = s1.substring(0,7)+s2+" "+s1.substring(6);
        System.out.println(s4);



    }
}
