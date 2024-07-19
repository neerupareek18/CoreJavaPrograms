package PracticePrograms_18072024;

public class Lab066_DiagonalElementsIn2DArray {
    public static void main(String[] args) {
        String s[][] = {{"Amit", "Sonal", "Riya"}, {"Dia", "Rajat", "Siya"},{"Harsh", "Varsha", "Sumit"}};
        if(s.length!=s[0].length){
            System.out.println("Can't print the diagonal elemtns");
        }
        else {
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s[0].length; j++) {
                    if (i == j) {
                        System.out.println(s[i][j]);
                    }
                }
            }
        }
    }
}
