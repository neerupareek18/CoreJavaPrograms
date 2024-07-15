package PracticePrograms;

public class Lab001 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // For single line comment -- Instructions for team mates
        /*
        For multi line comment -- For Documentation
         */

        //ctrl+D -- To duplicate the line
        //main+enter for main line
        //sout+tab for print line
        //ctrl+shift+f10 -- for executing the program

        System.out.print("print -- will not add a new line after this");
        System.out.printf("printf -- used for formatting\n");
        // \n -- adding a new line
        /*
        %d for int
        %f for float, double
        %s for char and string
         */
        int i=10;
        float f = 10.09f;
        char c = '9';
        String s = "Neeru";

        System.out.printf("%d\n",i);
       System.out.printf("%f\n",f);
        System.out.printf("%s\n",c);
        System.out.printf("%s",s);
        //implicit casting does not work for %d, f, s -- it is used tightly for the respective data types

            }
}
