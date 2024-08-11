package PracticePrograms_10082024;

public class Lab106_AddCarToString {
    public static void main(String[] args) {
        String s = "My name is Neer";
        Character c ='u';
        //Using Operator
        String s1 = s+c;
        System.out.println(s1);

        //String Builder
        StringBuilder sb = new StringBuilder(s);
        sb.insert(sb.length(),c);
        System.out.println(sb);

        String str4="One Three";
        char c1='2';
        String str6 = str4.substring(0,4)+ c1+ str4.substring(3);
        System.out.println(str6);


    }


}
