package Ex_20072024;

public class Lab089 {
    public static void main(String[] args) {
        //Functions -- block of code which can be reused
        //Pre-defined, User defined

        //Pre-defined -- ex: Math.max()
        //User defined -- Two components -- Definition, Call
        //methods are used in separate class

        greet();
        greet("Neeru");
        for(int i =0; i<10; i++){
            greet();
        }
        System.out.println(greet(8, "Neeru"));
        greet2();

        char c = greet2();
        System.out.println(c);

    }
//Method/function without parameter and return type
    static void greet(){  //only static functions can be called from sttaic function
        System.out.println("Hi");
    }
    //Functions with parameters no return type
    static void greet(String s){
        System.out.println("Hi "+ s);
    }
//    static String greet (String s){     ---Not allowed -- It considers it as duplicate method
//
//    }

    //Function with return type and parameter
    static String greet(int i, String s){
        return "Hi "+s+" with age "+i;
    }

    static void greet (int i){
        System.out.println(i);
    }
//static int greet(){   ------------- Not allowed, it will consider as duplicate function
//        return 1;
//}
        //return type with no return type
    static char greet2(){
        return 1;     //--------------Takes it as the ASCII code
    }

    static void _bhk(){ ////Name as 2bhk not allowed --- starting from number

    }

}
