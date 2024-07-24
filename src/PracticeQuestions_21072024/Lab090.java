package PracticeQuestions_21072024;

public class Lab090 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i <= 4) {
                System.out.println(i);
                continue;
            }
            if (i == 5) {
                System.out.println(i);
                continue;
            }
            break;
        }

    }
}