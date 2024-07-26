package SelfPacedEx_24072024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab101_ArrayList2 {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        //This will have any data type in the arraylisy
        //But if we want to restrict the data type, use diamond operator

        List <Double> mylist1 = new ArrayList();
        //Can add the diamond operator in Object side als, but it is optional now

        mylist1.add(10.0);
        //mylist1.add(10); -- it is not allowed as it allows only double
        //mylist1.add("Neeru"); -- String is not allowed in Double
        mylist1.add(9.0);
        System.out.println(mylist1.contains("Neeru"));
        System.out.println(mylist1.contains(9));
        System.out.println(mylist1.contains(9.0));

        //We can print the elements using for loop, for each loop and

        //Iterator -- It is a interface, it is like a cursor
//Iterator can be used in any type of collection
        Iterator itr = mylist1.iterator();
        while(itr.hasNext()){
            //mylist1.add("Neeru"); This is not possible in Iterator
            System.out.println(itr.next());
        }
        //Enumeration is also there for iteration, it is the older class
        //Iterator goes in the forward direction only, but if we want to go reverse, we can use
        //ListIterator:

        //List Iterator can be applicable to AyyatList and LinkedList
        ListIterator lt = mylist1.listIterator(mylist1.size());
        while(lt.hasPrevious()){
            //But in list iterator, we can add/remove elements during iteration
            //lt.add("Neeru"); --------- It is giving infinte -- Why???????
            System.out.println(lt.previous());
        }

    }


}
