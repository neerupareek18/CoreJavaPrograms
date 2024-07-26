package SelfPacedEx_26072024;

import java.util.TreeSet;
import java.util.Set;

public class Lab121_TreeSet {
    public static void main(String[] args) {
Set s = new TreeSet();
//Tree Set is responsible for sort by default
        s.add("Sort");
        s.add("Jai");
        s.add("Ko");
        s.add("Harsh");
        //s.add(null); //null value is not allowed in case of Tree Set as sorting can't be done
        //System.out.println(s); //Since we have added hetrogeneous, sorting can't be done so it will throw Exception

        //Tree should not be used when we have to store different type of Data Type


    }
}
