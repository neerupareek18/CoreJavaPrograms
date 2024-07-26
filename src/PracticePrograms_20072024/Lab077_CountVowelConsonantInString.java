package PracticePrograms_20072024;
//How to ignore punctuations, symbols from a string
public class Lab077_CountVowelConsonantInString {
    public static void main(String[] args) {
        String s = "1Eeeru!123";
        s=s.toLowerCase();
        int vowel = 0;
        int consonant = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='i'||s.charAt(i)=='u')
        vowel++;
            else if (s.charAt(i)>'a'&&s.charAt(i)<'z')
            consonant++;
        }
        System.out.println("Vowels --> "+vowel);
        System.out.println("Consonants --> "+consonant);

        //----------------------APPROACH 2----------------------------
        //-------------------REGEX NOT WORKING-----------------------
        vowel =0;
        consonant=0;
        s=s.replaceAll("[^a-zA-Z]","");
        System.out.println(s.replaceAll("[aeiou]","").length());
        System.out.println(s.replaceAll("[^aeiou]","").length());
//        System.out.println(s);
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='i'||s.charAt(i)=='u')
//                vowel++;
//            else
//                consonant++;
//        }
//        System.out.println("Vowels --> "+vowel);
//        System.out.println("Consonants --> "+consonant);
        }


    }
