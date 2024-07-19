package PracticePrograms_18072024;

public class Lab059_StarPattern1 {
    public static void main(String[] args) {
        int n = 3;
        for(int i =0; i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
