package PracticePrograms_15072024;

public class Lab023 {
    public static void main(String[] args) {
        //Real Time Example for Data loss in narrowing:

        int course = 100;
        float GST = 18.45F;
        //int total_price = course+GST; // Implicit Narrowing - JVM will not do
        int total_price = course+(int)GST; // Explicit narrowing - REAL time - money loss
        System.out.println(total_price);

    }
}
