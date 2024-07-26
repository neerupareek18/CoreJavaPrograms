package SelfPacedEx_25072024;

public class Lab116 {
    public static void main(String[] args) {
        char c = 'C';
        int i = switch(c){
            case 'A':
                System.out.println("First");
                yield 65;
            case 'B':
                System.out.println("Second");
                yield 70;
            default:
                throw new IllegalStateException("Unexpected Code--"+c);
        };
    }
}
