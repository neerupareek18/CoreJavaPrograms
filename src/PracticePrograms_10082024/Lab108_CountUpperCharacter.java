package PracticePrograms_10082024;

public class Lab108_CountUpperCharacter {
    public static void main(String[] args) {
        String s1 = "My %^Name Is Neeru";
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>=65&&s1.charAt(i)<=91){
                count++;
            }
        }
        System.out.println(count);
    }
}
