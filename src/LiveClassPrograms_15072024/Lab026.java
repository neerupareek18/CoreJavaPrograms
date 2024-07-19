package LiveClassPrograms_15072024;

public class Lab026 {
    public static void main(String[] args) {
        String name = "Pramod";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Pramod");
        // How many ways we can a String - 2
        // = , new operator
        // = "SCP" // Sting constant Pool
        // new - Objects(heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(10)); // Exception Index 10 out of bounds
//------------------------------------

        String name1 = "Pramod"; // Assignment Operators
        String name3 = new String("Pramod"); // New Operator

        // Both of them, actually save the name1, name3 in different ways JVM
        // How they store the values in the JVM? --  SCP nad Heap - JVM

    }
}
