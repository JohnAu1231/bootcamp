import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("hello");
        strings.add("abc");
        System.out.println(strings.size()); // 2

        strings.remove(1);
        System.out.println(strings);
        System.out.println(strings.contains("hello"));  //true
        System.out.println(strings.contains(new String("hello")));  //true

        List<String> ls = new LinkedList<>(); // linkedlist no index , but fuullfill List implement , can input index in get() method
        ls.add("hello");
        ls.add("abc");
        ls.add("def");
        for ( int i = 0; i < ls.size(); i++) {  // forloop
            System.out.println(ls.get(i)); //forloop , linkedlist get() is slow
        }

        ArrayList<String> as = new ArrayList<>();
        as.add("hello");
        as.add("abc");
        as.add("def");
        as.remove(10);
    }
}

