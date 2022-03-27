package Ex5;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PersonEvaluator {
    ArrayList<Person> persons;

    public PersonEvaluator(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public void findAndPrint(){
        System.out.println("People whose name starts with P");
        persons.stream()
                .filter(x -> x.Name.startsWith("P"))
                .map(x->x.Name)
                .forEach(System.out::println);

        System.out.println("People who is older than 18:");

        persons.stream()
                .filter(x -> x.Age > 18)
                .map(x->x.Name)
                .forEach(System.out::println);
    }

    public void groupAndPrint(){
        var result =  persons.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        result.forEach((key, value) -> System.out.println(key + ":" +
                value.stream().map(x->x.Name).collect(Collectors.joining(","))));
    }

    public void getAverageAge() {
        persons.stream()
                .mapToDouble(persons -> persons.Age)
                .average()
                .ifPresent(avg -> System.out.println("\nAverage age is " + avg));
    }
}
