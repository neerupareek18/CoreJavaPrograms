package LiveClassPrograms_20072024;

public class Lab100 {
    public static void main(String[] args) {
        /*
A Wrapper class is a class whose object wraps or contains primitive data types.
They convert primitive data types into objects.
Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
An object is needed to support synchronization in multithreading.
   */
        Integer i = 5;
        int i1 = 5;

        System.out.println(i==i1); //true -- why? Integer creates the object, and int i is the variable name
        String s1 = String.valueOf(i1);
        System.out.println(s1);

        Byte b = 10;
        Short s = 30;
        Long l = 300l;
        Character c = 65;
        Float f = 30f;
        // Double d = 50; ----------- giving error
        //double d = 50; ------------ it is working
        Double d = 50.0;
        Boolean b1 = true;

        int i2 = 5;
        //Primitive to String
        String s3 = String.valueOf(i2);
        String s4 = Integer.toString(i);
        String s5 = "Tinaa";

        //String to Primitive
        int i3 = Integer.parseInt(s3);
        System.out.println(i3);
        //System.out.println(Integer.parseInt(s5)); -- NUmber Format Exception

        //Other conversions are also there







    }

}
