package ParcticePrograms_07082024;

public class Lab145_HollowDiamondPyramid {
    public static void main(String[] args) {
        int n=2;
        for(int i=0;i<n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j==n-i||j==n+i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
int n1=n-2;
        for(int i=n1;i>=0;i--){
            for(int j=1;j<=2*n-2;j++){
                if(j==n-i||j==n+i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}