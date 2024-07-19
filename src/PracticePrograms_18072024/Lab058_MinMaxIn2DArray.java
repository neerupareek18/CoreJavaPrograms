package PracticePrograms_18072024;

public class Lab058_MinMaxIn2DArray {
    public static void main(String[] args) {
        int a[][] = {
                {1,2,3},
                {4,10,6},
                {7,8,9}
        };
        int column = a[0].length;
        int max = Integer.MIN_VALUE;
        for (int i =0; i<a.length; i++){
            for (int j = 0; j<a[0].length;j++){
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
        }
        System.out.println("Max Value-->"+max);
    }
}
