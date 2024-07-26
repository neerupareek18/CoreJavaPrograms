package SelfPacedEx_26072024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab119_HashSet {
    public static void main(String[] args) {
        //Set ----- only adds unique elements
        //Order is not maintained in set, it stores randomly
        //Duplicate add will not give error but will not get stored
        Set s = new HashSet();
        s.add("Adi");
        s.add("Riya");
        s.add("Saurabh");
        s.add(10);
        s.add(10);
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.contains(10));
        System.out.println(s.remove("Sakshi")); //false
        System.out.println(s.remove("Saurabh")); //true
        System.out.println(s);

        Iterator i = s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        for(Object o: s){
            System.out.println(o);
        }

        s.clear();
        System.out.println(s.isEmpty());

        //Hashset is fastest and retrieving way

    }
}
