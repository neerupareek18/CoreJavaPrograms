package SelfPacedEx_26072024;

public class Lab126_Generics {
    public static void main(String[] args) {
        //Generics -- allows you to abstract from different DataTypes

        //use of T

        printf(2,3);
        printf("Name", "Age");
    }
        public static <T> void printf(T i, T i1){
            System.out.println(i);
            System.out.println(i1);
        }

        //One String, One Integer can't be possible -- it would be difficult
    }
