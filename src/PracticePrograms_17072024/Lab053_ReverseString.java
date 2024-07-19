package PracticePrograms_17072024;
//Not Done
public class Lab053_ReverseString {
    public static void main(String[] args) {
        String s = "Neeru";
        String s1 = "";
        char a[] = new char[s.length()];
        int j =0;
        for(int i = s.length()-1; i>=0;i--){
           a[j]=s.charAt(i);
            System.out.println(a[j]);
        }

        for (int k=0;k<a.length;k++)
            System.out.print(a[k]);
        //-------------------------------------------------------------------------
        //This worked
        String   ss = "Neeru";
        System.out.println(s==ss);
        String rev = "";
        for (int i =ss.length()-1; i>=0;i--){
            rev = rev+ss.charAt(i);
        }
        System.out.println(rev);
    }
}
