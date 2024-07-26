package SelfPacedEx_26072024;

import java.util.*;

//They are -- HashMap -- No Order, LinkedHashMap -- Insertion Order, TreeHashMap -- Natural Order, HashTable
public class Lab124_HashMaps {
    public static void main(String[] args) {
        //Maps -- key value pair
        //Generally used in API automation -- as JSON is in Key-Value format


        //Some allows null

        Map <String, Object> m= new HashMap();
        m.put("Name", "Neeru");
        m.put("Name", "Amit"); //Keys can't be duplicate, it will replace the first value, Amit will be printed
        m.put("Age", 65);
        m.put("Country", "India");
        m.put("Course", "ATB");
        m.put("isFemale", true);

        Map <String, Object> m2= new HashMap();
        m2.put("Name", "Neeru");
        m2.put("Name", "Amit1"); //Keys can't be duplicate, it will replace the first value, Amit will be printed
        m2.put("Age", 60);
        m2.put("Country", "Country Name");
        m2.put("Course", "MTB");
        m2.put("isFemale", false);

        System.out.println(m);
        System.out.println(m.isEmpty());
        System.out.println(m.get("Area"));
        System.out.println(m.get("Age"));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.remove("Course"));
        System.out.println(m.containsKey("Area"));
        System.out.println(m.containsValue(65));

//        for(int i =0; i<m.keySet().size(); i++){  -- How to use it
//            System.out.println(m.get(i));
//        }

        //How to use Iterator??

        //for Each loop:
        for(Map.Entry<String,Object> m1: m.entrySet()){
            System.out.println(m1.getKey()+"-"+m1.getValue());
        } //No Order
        m.clear();
        System.out.println(m);
        System.out.println(m.isEmpty());

        //WeakHashmap is also there --- It will delete the keys if not used in the program.
        //After running the session, they go to the Garbage Collector

        //TreeHashMap and LinkedHashMap can also be used in the same way, the methods are almost same

        //List of maps:

        List l = new ArrayList<>();
        l.add(m);
        l.add(m2);
        System.out.println(l);
        System.out.println(l.get(0));
        System.out.println(l.get(1));



    }
}
