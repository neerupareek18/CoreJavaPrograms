package PracticePrograms_20072024;

import java.util.Scanner;

public class Lab075_NumberIsPalindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = s.nextInt();
        String inttostring = ""+input;
        boolean result = true;
        for(int i=0;i<inttostring.length()/2;i++){
            if(inttostring.charAt(i)!=inttostring.charAt(inttostring.length()-i-1)){
                result = false;
                break;
            }
        }
        if(result==false)
            System.out.println("Not a Palindrom");
            else
            System.out.println("Palindrom");
    }


}
