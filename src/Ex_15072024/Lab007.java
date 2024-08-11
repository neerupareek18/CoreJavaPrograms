package Ex_15072024;

public class Lab007 {
    public static void main(String[] args) {
        // data_type variable_name = variable_value(literal)

        //Data Types -- Primitive and Non-Primitive

        //Java is not fully Object-Oriented due to use of Primitive data types,
        // use of Static
        // and Wrapper classes

        //Primitive Data Types -- Boolean, Integral

        //Boolean
        boolean b = true; //or false -- by default value is false
        //by default values would be printed only in case of instance and static variables, we need to initialise local variables before use
        System.out.println(b);

        //Integral -- byte, short, int, long, char, float, double

        byte b1 = 127; // 1 byte -127 to 128 defaut value -- N/D
        //Internally, this 127 be converted into the 8 bit code (Machine understandable form)

        short s = 9999; //2 byte default --- 0
        int i = 999999999; //4 byte default ---- 0
        long l = 5934859349999999999l; // 8 byte default ----- 0, l is mandatory to provide at the end

        float f = 758438563475634785634.345743586345763458763475635763457346534765343475345345f;
                // 4 byte but range is in exponential -- default 0.0f, mandatory to provide 'f' at the end
            //Output -- 7.5843855E20
        double d = 487835643785634785637856337563657345.345876345783465783465345364375634756;
                //8 byte, but range is in exponential
        //default --- 0.0
        //Output -- 4.878356437856348E35

        System.out.println(b1);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        //Non - Primitive Data Types -- String, Array, etc.
        //Also known as references data types -- 8 byte

        //String:
        String s1 = "Neeru"; //always in double quotes -- created in String Constant Pool
        //char c = "b"; -- not possible as character type is always in single quotes

//        char c1 = (char) "b"; -- even this explicit conversion is not possible

        String s2 = new String("Neeru");//created in heap memory
        String s3 = s2;
        System.out.println(s3);

        String s4 = new String ("Neeru");

    }
}
