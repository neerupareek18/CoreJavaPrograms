package Ex_20072024;

public class Lab081 {
    public static void main(String[] args) {
        //Loops -- for, do-while, while : To perform a task multiple times - repeatation, iteration
        //Conditional loops -- if-else, switch (multiple condition)

        //for -- initialisation --> Condition for termination --> in/dec/ Updation

        for(int i=1;i<=10;i=i+1){
            System.out.println(i);
        }
        //In case of for loop, since in/dec is last line -- pre and post inc/dec does not make any difference

        //for(int _ =0; _<5: _++) // _ is not allowed for the variable name

        //for supports -- float, int, short, byte, long, double, char
        //String is not supoorted in for loop

        for(int _1 =0; _1 <10;_1++ ){
            System.out.println(_1);
        }

        for(int i =0;i>1;i++){} //-----------No Output
        for(int i =0;i>=1;i++){} //-----------No Output

//        for(;;){} //---Infinite condition
//
//        for(int i =0;;i++){
//            System.out.println(i);
//        } //-----------NO Condition is possble -- infinite loop as there is no exit condition

        //We cannot type any statement after infinite loop -- it will give unreachable statements

        for (float f =0; f<10.67; f++){ //Float is supported in for loop
            System.out.println(f);
        }

        for(byte i =1; i<10.67;i++){} //will print till 10

        for(byte i =1; i<10;i++){} //will print till 9

        for(char i= 'A'; i<65; i++){} // -------- Char is also an integer in ASCII code

        for(char i= 'A'; i<'z'; i++){}

        //Reverse loop:

        for(int i =10; i>0;i--){}

        int i=0;
        for(;i<10;i++){
            System.out.println(i);
        }
        //We cannot change the sequence of intialisation, condition and in/dec

        for(int j = 0; j<10;){} //Infinite Loop -- without inc. dec. possible

        for(;;){} //infinite can be the last

        }

    }
