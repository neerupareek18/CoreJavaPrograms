package PracticePrograms_18072024;

import java.util.Arrays;

public class Lab067_Anagram {
    //silent == listen (letters are same) -- anagram
    public static void main(String[] args) {
        String s1 = "borbd";
        String s2 = "brobd";
        StringBuilder s3 = new StringBuilder(s1);
        String[] a1 = s1.split("");
        String[] a2 = s2.split("");
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        boolean b=true;
        for(int i=0; i<a1.length;i++){
            if(!(a1[i].equals(a2[i]))){
                b=false;
                break;
            }
        }
        if(b){
            System.out.println("Anagrams");
        }
        else System.out.println("Not Anagrams");
    }
}