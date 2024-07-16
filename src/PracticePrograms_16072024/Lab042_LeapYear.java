package PracticePrograms_16072024;

public class Lab042_LeapYear {
    public static void main(String[] args) {

        //Leap Year

        int year = 2200;
        if(year%400==0&&year%4==0) System.out.println("Leap Year");
        else if (year%400!=0&&year%4==0)System.out.println("Not a leap year");
        else if(year%4!=0) System.out.println("Not a leap year");
    }
}
