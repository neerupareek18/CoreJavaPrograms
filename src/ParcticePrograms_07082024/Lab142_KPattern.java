package ParcticePrograms_07082024;

public class Lab142_KPattern {
    public static void main(String[] args) {
        for(int i=5;i>0;i--){
            char c = (char)65;
            for(int j=0;j<i;j++){
                System.out.print(c);
                c = (char)(c+1);
            }
            System.out.println();
        }

        for(int i=2;i<=5;i++){
            char c = (char)65;
            for(int j=0;j<i;j++){
                System.out.print(c);
                c = (char)(c+1);
            }
            System.out.println();
        }
    }
}

/*
ABCDE
ABCD
ABC
AB
A

A
AB
ABC
ABCD
ABCDE
 */
