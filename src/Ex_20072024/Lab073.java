package Ex_20072024;

public class Lab073 {
    public static void main(String[] args) {
        int a1= 8;
        char a = switch(3){
        case 1:
            System.out.println("A");
            yield 'A'; //No need to use break in case of yield
        case 2:
            System.out.println("B");
            yield 'B';
        default: throw new IllegalStateException("Unexpected value"); //Why is it not printing this line
    };
        System.out.println(a);
    }
}
