package PracticePrograms_17072024;

public class Lab047_CheckMemoryAllocation {
    public static void main(String[] args) {
        String s[] = {"Neeru", "Pareek"};
        String s1 = "Neeru";
        s[0].toLowerCase();
        System.out.println(s[0]);
        System.out.println(s[0]==s1); //true

        int i[]={1,2,3,4,5};
        int i1 = 2;
        System.out.println(i[0]==i1); //false

        char c[]={'A','B'};
        char c1='A';
        System.out.println(c[0]==c1); //true
    }
}

//Are the array elements of String type present in SCP?
