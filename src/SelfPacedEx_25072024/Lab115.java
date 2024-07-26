package SelfPacedEx_25072024;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab115 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(80);
        l.add(70);
        l.add(60);
        l.add(40);

        Collections.sort(l); //-Normal Sorting

        Student s1 = new Student(1, "Neeru");
        Student s2 = new Student(-1, "Tina");
        Student s3 = new Student(4, "Hina");

List stud = new ArrayList();
stud.add(s1);
stud.add(s2);
stud.add(s3);
        System.out.println(stud);
        Collections.sort(stud); //Does the sorting only by the overriden parameter (either id or name)
        System.out.println(stud);
        //But if we want option to sort by any paramter in any way we want, we need to create classes which implements Comparator

        Collections.sort(stud,new SortByIdDesc());
        System.out.println(stud);
    }
}
