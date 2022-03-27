package Ex3;

import java.util.ArrayList;
import java.util.Locale;

public class ListProcessingWithStreams3 {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("a1");
        list.add("c3");
        list.add("a2");
        list.add("a3");
        list.add("b3");
        list.add("b2");
        list.add("c1");
        list.add("c2");
        list.add("b1");

        list.stream()
                .filter(x->x.startsWith("b"))
                .forEach(System.out::println);

    }
}
