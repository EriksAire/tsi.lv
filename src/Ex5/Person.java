package Ex5;

public class Person {
    int Age;

    String Name;

    public Person(String name, int age) {
        Name = name;
        Age = age;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
