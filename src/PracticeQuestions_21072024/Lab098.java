package PracticeQuestions_21072024;

public class Lab098 {
    public static int sum(int n) {
        if (n <= 0) {
            return sum(n + 1);
        }
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sum(-5));
    }
}
