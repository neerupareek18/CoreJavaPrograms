package Ex_20072024;

import java.util.Scanner;
//switch supports -- int, byte, short, long, char, string
//two cases with same name not allowed
//float, double not allowed in the case
//range is not allowed in switch
public class Lab072 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
                char c = s.next().charAt(0); //Taking char input
        //Multiple conditions in case are allowed in >13 JDK
switch(c){
    case 65,66,67,68,69: System.out.println("Vowel"); //ASCII Value
    break;
    default:
        System.out.println("Consonant");
}
    }
}
