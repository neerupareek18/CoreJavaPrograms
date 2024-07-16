package PracticePrograms_16072024;
import java.util.Scanner;

public class Lab041_VowelConsonant {
    public static void main(String[] args) {
        //Vowel or consonant
        char c[] = {'A','a','E','e','I','i','O','o','U','u'};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character");

        char c1 = s.next().charAt(0); // ------------------ There is no nextChar()
        int flag = 0;
        int loop = 0;

        for(int i =0; i<c.length; i++){
           if(c1==c[i]) {
               flag = 1;
               break;
           }
           loop++;
            System.out.println(loop);

        }
        if(flag==0){
            System.out.println("It is a consonant");
        }
        else
            System.out.println("It is a vowel");

        System.out.println("Loop Count -- "+loop);

    }
}
