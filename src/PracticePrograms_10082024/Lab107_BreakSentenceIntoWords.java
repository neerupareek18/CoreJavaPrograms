package PracticePrograms_10082024;

import java.util.Arrays;

public class Lab107_BreakSentenceIntoWords {
    public static void main(String[] args) {
        String s = "My name is Neeru";
        String s1[] = s.split(" ");
        System.out.println(Arrays.toString(s1));
    }
}
