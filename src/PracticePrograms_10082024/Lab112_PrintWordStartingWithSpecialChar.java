package PracticePrograms_10082024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab112_PrintWordStartingWithSpecialChar {
    public static void main(String[] args) {
        String s ="My \\dname %is Neeru*";
        String s1[] = s.split(" ");
        Pattern p = Pattern.compile(".*\\W.*");
        for(int i=0;i<s1.length;i++){
            {
                Matcher m = p.matcher(s1[i]);
                Boolean b = m.matches();
                if(b){
                    System.out.println(s1[i]);
                }
            }
        }

    }
}
