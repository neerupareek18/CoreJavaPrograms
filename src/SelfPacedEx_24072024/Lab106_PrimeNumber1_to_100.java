package SelfPacedEx_24072024;

public class Lab106_PrimeNumber1_to_100 {
    public static void main(String[] args) {
        for(int i = 0; i<=100; i++){
            boolean prime = true;
            for(int j =2; j<=i/2; j++){
                if(i%j==0){
                    prime = false;
                    break;
                }
            }
            if(prime==true){
                System.out.println(i);
            }
        }
    }
}
