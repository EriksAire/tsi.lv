package Ex7;

import Ex6.IAnimal;

public class Dog implements IAnimal, IDomestic {
    final String DogName;

    public Dog(String dogName) {
        DogName = dogName;
    }

    @Override
    public void sound() {
        System.out.println("Bark");
    }

    @Override
    public void PrintName() {
        System.out.println("Dog`s name is " + DogName);
    }
}
