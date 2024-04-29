import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
    
    public static void main(String[] args) {
        
        // Queue is a contract/ interface
       List<String> strings = new  LinkedList<>();
       strings.add("hello");
       strings.remove(0);
       strings.add("def");

       Queue<String> strings2 = (Queue<String>) strings; // risk
       // strings2.reove(1); // queue does not have index concept
       strings2.add("abc");
       System.out.println(strings2.size()); //2

       System.out.println(strings2.poll()); //def  , poll() means take the head object (remove and return)
       System.out.println(strings2); // abc
       System.out.println(strings2.poll()); //abc
       System.out.println(strings2.poll()); //null

       strings2.add("xyz");
       strings2.add("ijk");
       System.out.println(strings2.peek()); // xyz, return the head objecgt (without removal)

       //while loop
    //    while(strings.size() > 0) {  //size() is not stable
        
        while (!(strings2.isEmpty())) {
        System.out.println(strings2.poll());
        }
        System.out.println(strings2.size());

        strings2.add("abc");
        strings2.add("def");

        Queue<Integer> integers = new LinkedList<>();
        
        integers.add(1);
        integers.add(101);
        integers.add(2);
        integers.add(90);
        integers.add(-8);
        int count = integers.size();
        int thisInt = -1;
        while (count-- > 0) {
            thisInt = integers.poll();
            if (thisInt % 2 ==0)
                integers.add(thisInt);
        }
        System.out.println(integers);
        // while (!integers.isEmpty()) {
        //     System.out.println(integers.poll());
        // }
        System.out.println(integers.remove()); // when queue is null, poll()  gets null, remove() gets exception(run time error)
        System.out.println(integers);
       
        System.out.println(integers.add(2000));//true
        System.out.println(integers.add(1000));//true
        System.out.println(integers.remove(1000)); //true
        System.out.println(integers.remove(1500));// false, because Integer.class has override equals()
    } 
}
