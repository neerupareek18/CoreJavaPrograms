package Ex_27072024;

public class Lab133 {
    public static void main(String[] args) {

//We don't generally use String in Automation -- as they are immutable
        //We generally use String Builder , StringBuffer
        StringBuffer sb = new StringBuffer("Neeru");
        sb.append("Pareek");
        //There is only one String with Neeru Pareek, in SCP, it creates a new String
sb.reverse().toString();
        //String Builder is also same as String Buffer but thread safety is different
//String Builder -- multi threaded env.
   // String Buffer -- single threaded env.
        //Synchronised means -- time is allocated to a particular thread -- thread safe, one by one execution

    }
}
