package SelfPacedEx_24072024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        Iterator itr = mylist1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //Enumeration is also there for iteration, it is the older class


    }


}
