package PracticePrograms_20072024;

public class Lab080_ReverseNumber_Palindrome {
    public static void main(String[] args) {
        int i = 17670;
        //if int i = 07670 ----- it is the Octal code of decimal number
        int temp =i;
        int rev=0;
        int rem;
        while (temp!=0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        System.out.println(rev); //Worked till now
        //Not taking 0 in the first number -- so not palindrom
        if(i==rev)
            System.out.println("Palindrome");
            else
            System.out.println("Not Palindrom");

    }

}
