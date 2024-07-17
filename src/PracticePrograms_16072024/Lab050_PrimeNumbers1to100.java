package PracticePrograms_16072024;

public class Lab050_PrimeNumbers1to100 {
    public static void main(String[] args) {

        for(int i =1; i<=100; i++){
            int multiple = 0;
            for(int j =1; j<=i;j++){
                if(i%j==0){
                    multiple++;
                }
            }
            if (multiple==2){
                System.out.println(i);
            }
        }
    }
}
