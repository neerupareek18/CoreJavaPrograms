package PracticePrograms_17072024;

public class Lab046_HeapSCPProgram {

    //To be clarified

    public static void main(String[] args) {
        String str1 = "Hello"; // in SCP
        String str2 = " Guys"; // in SCP
        String str3 = "Hello Guys"; // in SCP
        String str4 = str1.concat(str2);// in Heap
        String str5 = "Hello" +" Guys"; // in SCP
        String str6 = str1 + str2; // in Heap
        String str7 = "hello"; //in SCP
        String str8 = str1.toLowerCase(); //in Heap

        System.out.println(str7==str8); //False -- str7 in SCP, str8 in Heap

        System.out.println(str3 == str4); // False
        System.out.println(str3 == str4.intern()); //True
        //The method intern() creates an exact copy of a String object in the heap memory
        // and stores it in the String constant pool.
        // Note that, if another String with the same contents exists in the String constant pool,
        // then a new object won't be created and the new reference will point to the other String.

        System.out.println(str5 == str6); // false
        System.out.println(str3 == str5); // true as both in scp
        System.out.println(str4 == str6); // false, in heap but differnt objects
    }
}
