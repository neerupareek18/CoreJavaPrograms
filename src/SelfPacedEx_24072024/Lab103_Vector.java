package SelfPacedEx_24072024;

import java.util.Enumeration;
import java.util.Vector;

public class Lab103_Vector {
    public static void main(String[] args) {
        //Vector -- almost same as Array
        //It extends AbstractList and implements List

        //It is thread safe -- one by one -- Slow Process
        Vector v = new Vector();
        v.add("Neeru"); //done by thread t1
        v.add("Kiran"); //done by thread t1
        v.remove(1); ////done by thread t1
        //thread t2, t3 will wait
        //It is done one by one

        //In case of Array list , there is no thread safety

        //We don not use the object which is thread safe as they are slow (mostly)

        //Vector is a legacy class -- obsolete

        //To print the Vecotrs, we need to use Enumerator
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
