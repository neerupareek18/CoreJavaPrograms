package SelfPacedEx_24072024;

public class La109_RemoveOccurenceOfCharInString {
    public static void main(String[] args) {
        char c = 's';
        String s = "Nesserus";
        StringBuilder s1 = new StringBuilder(s);
//        for(int i=0; i<s1.length(); i++){
//            if(s1.charAt(i)==c){
//                s1.replace(i,i+1,""); //it takes inclusive of start index and exclusive of end index
//            }
//        }
//        System.out.println(s1);

        System.out.println(s.replace(Character.toString(c),""));
    }

}
