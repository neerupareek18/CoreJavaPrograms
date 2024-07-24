package SelfPacedEx_24072024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab100_ArrayList1 {
    public static void main(String[] args) {
        //Arrays -- no sort functions - no build in support,
        // func. to increase the size, memory is wasted
        //Operations like insertion and deletion are very heavy

        //To overcome this, Java created Legacy Classes and Interface
        //Collection Framework was introduced in JDK 1.2

        //Collection Framework -- Different ways to store the elements
        //List is an Interface and contains classes which inplements the methods of these interface

        List shopping_list = List.of("Milk", "Cheese");
        System.out.println(shopping_list);
        System.out.println(shopping_list.size());
        List fruits = List.of("Apple", "Banana", "Papaya", "Banana");
        System.out.println(fruits);
        System.out.println(fruits.size());


        //Arrays can store homogeneous elements
        //List can store different types of element -- Hetrogeneous
        List misc = List.of(100,true, "Some", "Some"); //List can contain duplicates
        System.out.println(misc.get(0));
        System.out.println(misc.indexOf("Some")); //It will return 1st index
        System.out.println(misc.isEmpty());
        //misc.add(2,"100");              --- Unsupported function
        //because list is in a interface and of() is a static function
        //Class loading is already done (it is done only once)

        //So we need to go towards the classes which implements the methods of this interface

        List array_list = new ArrayList(); //Father reference with Child Object -- Dynamic dispatch
        //all functions -- add, remove, clear, contains, indexOf, etc.

        ArrayList array_list1 = new ArrayList();
        //List my_list = new List(); ----- This is not possible as the object creation of an interface and abstract classes are not allowed

        array_list.add("Neeru");
        array_list.add(100);
        array_list.add(true);

        System.out.println(array_list);
        System.out.println(array_list.size());

        array_list.remove(2);
        array_list.remove(true); //Remove the first matched element
        array_list.add(1,"Random");   //add at any index
        System.out.println(array_list); //Duplicates are allowed in ArrayList

        array_list.add("Random");

        //System.out.println(array_list.sort(==)); -- how to use sort??

        //We can also replace the values on any index using set
        array_list.set(2, "Replaced");
        System.out.println(array_list);

        //We can also print the array elements using for loop same as simple array
        for(Object obj : array_list){ //We use Object datatype as any datatype is allowed in ArrayList
            System.out.println(obj);
        }

        array_list.clear();
        System.out.println(array_list);
        System.out.println(array_list.isEmpty());

        //ArrayList uses dynamic array
        //It doubles the size when around 90% of arraylist is filled








    }
}
