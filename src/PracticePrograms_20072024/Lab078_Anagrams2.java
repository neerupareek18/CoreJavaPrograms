package PracticePrograms_20072024;

import java.util.Arrays;

public class Lab078_Anagrams2 {
    public static void main(String[] args) {
        String s1 = "!@ABC";
        String s2 = "(*&CB)A";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        s1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char c1[] = s1.toCharArray();
        Arrays.sort(c1);
        char c2[] = s2.toCharArray();
        Arrays.sort(c2);
        boolean result = true;

        for(int i =0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                result = false;
                break;
            }
        }
if(result) System.out.println("Anagram");
else System.out.println("Not Anagram");

    }
    }
