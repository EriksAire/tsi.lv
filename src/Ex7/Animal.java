package Ex7;

public class Animal {

    public static void main(String[] Args){
        var fox = new Fox("Lorem");
        var dog = new Dog("Ipsum");
        var cat = new Cat("Dolor");

        fox.sound();
        fox.PrintName();

        dog.sound();
        dog.PrintName();

        cat.sound();
        cat.PrintName();
    }
}
