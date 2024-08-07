package ParcticePrograms_07082024;

public class Lab144_DiamondTraingle {

    public static void main(String[] args) {
int n=5;
int star =1;
for(int i=n;i>0;i--){
    for(int j=0;j<i;j++){
        System.out.print("  ");
    }
    for(int j=0;j<star;j++){
        System.out.print("* ");}
    star+=2;
    System.out.println();
}
int star1=n+2;
        for(int i=n-1;i>0;i--){
            for(int j=n;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=0;j<star1;j++){
                System.out.print("* ");}
            star1-=2;
            System.out.println();
        }

    }
}
