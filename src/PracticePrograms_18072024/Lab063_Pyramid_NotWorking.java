package PracticePrograms_18072024;

//Not Done
/*
*****
 ***
  *
 */ //---This is not working
/*
  *
 ***
*****
 */

public class Lab063_Pyramid_NotWorking {
    public static void main(String[] args) {
//        int rows = 3;
        //-----------------NOT WORKING---------------------------------
//        for(int i =1; i<=rows; i++){
//            for(int j =1; j<=rows-i; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=2*i-1;k++)
//                System.out.print("*");
//        }
//        System.out.println();
//    }
        int rows = 5; // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

    }
}