package SelfPacedEx_25072024;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private int id;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student_Id--" + this.id + "Name--" + this.name;
    }


    /*@Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }*/

    //If we want to comapre it with String (name), then we need to remove Integer compare

    @Override
    public int compareTo(Student o) {
        return CharSequence.compare(this.name, o.name);
    }
}

//If we want to compare with any parameters, we need to create classes which implements Comparator

class SortByIdAsc implements Comparator <Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class SortByIdDesc implements Comparator <Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}

class SortByNameAsc implements Comparator <Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return CharSequence.compare(o1.getName(),o2.getName());
    }
}

class SortByNameDesc implements Comparator <Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return CharSequence.compare(o2.getName(),o1.getName());
    }
}


