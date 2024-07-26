package SelfPacedEx_25072024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab112_SortingList {
    public static void main(String[] args) {
        List i = new ArrayList<>();
        i.add("Neeru");
        i.add("Tina");
        i.add("Hi");
        Collections.sort(i);        //To sort the List, we need to use Collections
        //It will have class cast Exception, if the data types are not matching for the elements
        System.out.println(i);

    }
}
