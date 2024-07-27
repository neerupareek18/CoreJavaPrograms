package LiveClassPrograms_27072024;

public class Lab128 {
    public static void main(String[] args) {
        final int a[] = new int[3];
        a[3]=10;
        System.out.println(a[3]); //final doesn't mean the values can't be changed in array, it is for size
        //Even if final is not there, it is kind of final for size

        final int a1 = 10;
        //a1 = 4; // Not possible

     //Disadvantage of array --
        //Fixed Data type, wastage of memory, Fixed length

    }
}
