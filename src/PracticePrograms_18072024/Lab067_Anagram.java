package PracticePrograms_18072024;

public class Lab067_Anagram {
    //silent == listen (letters are same) -- anagram
    public static void main(String[] args) {
        String s1 = "bored";
        String s2 = "robed";
        StringBuilder s3 = new StringBuilder();
        if(s1.length()==s2.length()){
            for(int i =0; i<s1.length();i++){ //loop for silent
                for (int j =0;j<s2.length();j++){ //loop for listen
                    if(s1.charAt(i)==s2.charAt(j)){
                        s3.append(s1.charAt(i));
                    }
                }
            }
            System.out.println(s1);
            System.out.println(s3);
            if(s1.equals(s3.toString())){
                System.out.println("Strings are anagram");   //to String is importa
            }
            else
                System.out.println("Stings -- Not Anagram");
        }
        else System.out.println("Strings are not Anagram");
    }


}
