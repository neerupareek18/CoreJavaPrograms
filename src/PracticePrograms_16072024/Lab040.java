package PracticePrograms_16072024;

public class Lab040 {
    public static void main(String[] args) {
        //Largest of 3 numbers -- using if - else condition
        int a= 50;
        int b =40;
        int c= 30;
        if (a>b){
            if(a>c){
                System.out.println("Biggest Number -->"+a);
            }
            else
                System.out.println("Biggest Number -->"+c);
        }
        else if (b>c){
            System.out.println("Biggest Number -->"+b);
        }
        else
            System.out.println("Biggest Number -->"+c);
    }
}
