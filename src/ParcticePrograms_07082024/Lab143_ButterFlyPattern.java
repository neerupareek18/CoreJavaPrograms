package ParcticePrograms_07082024;

public class Lab143_ButterFlyPattern {
    public static void main(String[] args) {
        int n=5;
        int space = 5;
        //First Half of the Pattern --
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*space-2;j++){
                System.out.print(" ");
            }
            space--;
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Other Half
        int space1=1;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*space1;j++){
                System.out.print(" ");
            }
            space1++;
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}