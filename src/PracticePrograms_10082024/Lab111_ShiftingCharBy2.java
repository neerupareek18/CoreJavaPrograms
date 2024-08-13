package PracticePrograms_10082024;

public class Lab111_ShiftingCharBy2 {
    public static void main(String[] args) {
        String s = "Zeeru Pareek";
        String s1 = s.toLowerCase();
        String s3="";
        for(int i =0; i<s1.length();i++){
            int i2;
            if(s1.charAt(i)>=97&&s1.charAt(i)<=123){
             char c1 = s1.charAt(i);
             int i1 = c1;
             i2 = i1+2;
             if(i2>123){
                 int i3 = i2%123;
                 i2 =96+i3;
             }
                s3 = s3+(char)(i2);
        }
            else s3=s3+s1.charAt(i);

        }
        System.out.println(s3);
    }
}
