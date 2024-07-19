package PracticePrograms_18072024;
//Not Done
public class Lab064_Palindrom {
    public static void main(String[] args) {
        String s = new String("afa");
        String c[] = s.split("");
        boolean x = true;
        for(int i=0;i<c.length/2;i++){
            if(c[i]!=c[c.length-i-1]){
                System.out.println(c[i]);
                System.out.println(c[c.length-i-1]);
                System.out.println("String is not palindrom");
                x=false;
                break;
            }
        }
        if (x==true)System.out.println("String is palindrom");
    }
}
