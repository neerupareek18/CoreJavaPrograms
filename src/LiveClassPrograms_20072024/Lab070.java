package LiveClassPrograms_20072024;
//Switch

public class Lab070 {
    public static void main(String[] args) {
        //Which Day is it
        float d = 4; //Float is not allowed in Switch
        //Variables are not allowed in the case
        switch((int)d){
            // -> only works for single line statement not SOP
            case 1 -> System.out.println("Monday"); //No need to have break in case of ->
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not a valid number");
        }
    }
}
