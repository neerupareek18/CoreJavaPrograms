package PracticePrograms_18072024;
//Not Done properly ----- Remove Duplicates remaining
public class Lab065_DuplicatesInString {
    public static void main(String[] args) {
        String s = "Hellommm";
        char c[] = new char[s.length()];
        c[0]=s.charAt(0);
        char result[]=new char[s.length()];
        for(int i=0; i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)&&i!=j) {
                    System.out.println(s.charAt(i) + " is the duplicate letter");
                }
            }
        }
    }
}
