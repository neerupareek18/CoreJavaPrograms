package SelfPacedEx_26072024;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab125_HashTable {
    public static void main(String[] args) {
        Hashtable h = new Hashtable();
        h.put(1,"Amit");
        h.put(2,"Neeru");
        h.put(3,"Riya");

        //for loops can't be used for HashTable --- Enumberation is used

        Enumeration e = h.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

//        Enumeration e1 = h.values();
//        while(e1.hasMoreElements()){
//            System.out.println(e1.nextElement());
//        }

    }
}
