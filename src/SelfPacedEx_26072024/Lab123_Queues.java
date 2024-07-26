package SelfPacedEx_26072024;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab123_Queues {
    public static void main(String[] args) {
        //Queues -- used rarely -- First In First Out
        Queue q = new PriorityQueue(); //PriorityQueue is complete class
        q.add("A");
        q.add("A");
        q.add("B");
        q.add("C");

        //It sorts
        //Queeu can have duplicates
        System.out.println(q);

        q.offer("H"); //Offer is also used for add

        //null is not supported as sorting happens here

        q.poll();  //removes the first inserted element that is "A"
        System.out.println(q);

        q.peek(); //It is only to peek, view the first element

        //Iterator can be used
    }
}
