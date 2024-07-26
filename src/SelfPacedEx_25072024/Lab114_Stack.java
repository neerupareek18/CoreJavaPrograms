package SelfPacedEx_25072024;

import java.util.Stack;

public class Lab114_Stack {
    public static void main(String[] args) {
        //Stack -- First In - Last Out
        Stack s = new Stack();
        //Push --- to add the elements
        s.push("T");
        s.push("A");
        s.push("V");
        s.push("N");
        System.out.println(s);
        //Add is also available in Stack
        s.add("G");
        System.out.println(s);

        //Pop -- To remove the element at the top (last inserted one)
        s.pop();
        System.out.println(s);

        //Peek -- It will just peek the last element
        System.out.println(s.peek());  //No change in the Stack, it is just to peek





    }
}
