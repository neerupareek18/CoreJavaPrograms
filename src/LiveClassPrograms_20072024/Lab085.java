package LiveClassPrograms_20072024;

public class Lab085 {
    //String Builder functions
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Neeru Pareek");
        s.append('d');
        System.out.println(s);
        s.insert(5, 'h');
        System.out.println(s);
        s.delete(1,3);
        System.out.println(s);
        s.replace(0,3,"h");  //Not printing corect output
        System.out.println(s);

    }
}
