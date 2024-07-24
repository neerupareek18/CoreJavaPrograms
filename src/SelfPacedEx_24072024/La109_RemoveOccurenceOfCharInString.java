package SelfPacedEx_24072024;

public class La109_RemoveOccurenceOfCharInString {
    public static void main(String[] args) {
        char c = 's';
        String s = "Neerus";
        StringBuilder s1 = new StringBuilder(s);
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)==c){
                s1=s1.replace(i,i,"");
            }
        }
        System.out.println(s1);
    }
}
