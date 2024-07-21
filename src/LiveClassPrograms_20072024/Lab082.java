package LiveClassPrograms_20072024;

public class Lab082 {
    public static void main(String[] args) {
        for (int i =0; i<=10; i++){
            System.out.println(i); //Print till 5
            if(i==5)
                break; //it will come out of loop
            System.out.println(i); //Print till 4
        }

        for(int j =4;j<10;j++){
            System.out.println(j);
            break;
        }
        //break can be used in loop and if condition
    }
}
