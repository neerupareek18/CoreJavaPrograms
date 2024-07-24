package PracticeQuestions_21072024;

public class Lab091 {
    public static void main(String[] args) {

        //printf round off he decimal till 6 digits
        float pi = 3.1445498989f;

        System.out.println("\n" + "The value of Pi is =" + pi);

        System.out.printf("The value of pi is = %f" , pi);
        System.out.printf("The value of pi is = %.3f" , pi); //%.3f rounds off the decimal to 3 digits


//        Respective results:
//
//        The value of Pi is =3.1445498
//
//        The value of pi is = 3.144550
//
//                -----------------------------------------------------

        double distance=54.585997946464;

        System.out.println("\n" + "Distance between 2 cities is ->" + distance);

        System.out.printf("Distance is = %f", distance);


//        Respective results :
//
//        Distance between 2 cities is ->54.585997946464
//
//        Distance is = 54.585998
    }
}
