package PracticePrograms_15072024;

public class Lab032 {
    public static void main(String[] args) {
        String s1 = "Pramod";
        //String s1 = "P r a m o d";
        //          |0|1|2|3|4|5| -----------Index starts from 0
        char c = s1.charAt(5);
        System.out.println(c);
        s1 = s1.concat("Dutta"); // Pramod Dutta
        System.out.println(s1);

        // Non Primitive Types - String, Arrays, Class, ENUM.. more will come

    }
}
