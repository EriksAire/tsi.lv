package Ex5;

import java.util.ArrayList;

public class PersonProcessingWithStreams {
    public static void main(String[] args) {
        var person = new ArrayList<Person>();

        person.add(new Person("Max",28));
        person.add(new Person("Peter",22));
        person.add(new Person("Anna",28));
        person.add(new Person("Lilianna",16));
        person.add(new Person("Pamela",13));
        person.add(new Person("David",22));

        var PersonEvaluator = new PersonEvaluator(person);

        PersonEvaluator.findAndPrint();
        PersonEvaluator.groupAndPrint();
        PersonEvaluator.getAverageAge();

    }
}
