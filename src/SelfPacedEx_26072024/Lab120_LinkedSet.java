package SelfPacedEx_26072024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Lab120_LinkedSet {
    public static void main(String[] args) {
        //LinkedSet maintains the order
        Set s = new LinkedHashSet(10, 6);//Default loadfactor is .75
        //We can provide the size in HasSet, it will increase the size when reaches 9-10
        s.add("Adi");
        s.add("Riya");
        s.add("Saurabh");
        s.add(10);
        s.add(10);


    }
}
