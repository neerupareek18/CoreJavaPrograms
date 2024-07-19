package LiveClassPrograms_15072024;

public class Lab030 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2=" Guys";
        String str3="Hello Guys";
        String str4= str1.concat(str2); // Hello Guys
        String str5 = str1.concat(str2).concat("\n").concat(", You there?");
        System.out.println(str5);
        // SCAP -  4
    }
}
