package SelfPacedEx_24072024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;

public class Lab102_ArrayList3 {
    public static void main(String[] args) {
        //This is a class, so object can be created
        ArrayList mylist4 = new ArrayList(); //Child Class

        //All of them are Interfaces, so object can't be created for these
        List mylist3 = new ArrayList(); //Father Class reference
        SequencedCollection myslist1 = new ArrayList(); //Grand Class reference
        Collection mylist2 = new ArrayList(); //Grand-GrandClass

        //Behind the scene, it uses Dynamic array -- when 90% of elements are filled, it doubles the size
         mylist2.add(null);
         mylist2.add(null); //We can add nulls
        System.out.println(mylist2); // [null, null]

        mylist2.add("Adi");
        System.out.println(mylist2.equals(mylist3));
        mylist3.add(null);
        mylist3.add(null);
        mylist3.add("Adi");
        System.out.println(mylist2.equals(mylist3));

    }
}
