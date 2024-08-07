package ParcticePrograms_07082024;

public class Lab141_CapitaliseFirstLetterOfTheString {
    public static void main(String[] args) {
        String s = "my name is raj";
        String s1[] = s.split(" ");
        for(String s2:s1){
            Character c = s2.charAt(0);
            s2 = c.toString().toUpperCase()+s2.substring(1,s2.length());
            System.out.println(s2);
        }


    }
}
