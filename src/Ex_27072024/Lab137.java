package Ex_27072024;

public class Lab137 {
    public static void main(String[] args) {
        int aa[] = {'a','b','c'}; //Since char is an integer inb= backend, we can store char. in integer array
        System.out.println(aa[0]);
        StringBuilder sb = new StringBuilder("Pramod");
        sb.delete(1,2); //inclusion of start index and exclusion of end index
        System.out.println(sb);
    }
}
