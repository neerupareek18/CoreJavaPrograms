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

    public static class Lab146_HollowHourGlassPattern {
        public static void main(String[] args) {
            int n = 4;
            for(int i=0;i<n;i++){
                if(i==0){
                    for(int j=0;j<2*n-1;j++){
                        System.out.print("* ");
                    }
                }
                else{
                    for(int j=1;j<=2*n-1-i;j++){
                       if(j==i+1||j==2*n-1-i) {
                           System.out.print("* ");
                       }
                       else System.out.print("  ");
                    }
                }
                System.out.println();
            }
            for(int i=n-1;i>=1;i--){
                if(i==1){
                    for(int j=0;j<2*n-i;j++){
                        System.out.print("* ");
                    }
                }
                else{
                    for(int j=1;j<=2*n-i;j++){
                        if(j==i||j==2*n-i) {
                            System.out.print("* ");
                        }
                        else System.out.print("  ");
                    }
                }
                System.out.println();
            }

        }

    }
}