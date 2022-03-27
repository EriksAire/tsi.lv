package Ex4;

import java.util.ArrayList;
import java.util.Locale;

public class ListProcessingWithStreams4 {
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
                .filter(x->x.startsWith("c"))
                .map(x->x.toUpperCase(Locale.ROOT))
                .sorted()
                .forEach(System.out::println);
    }
}
