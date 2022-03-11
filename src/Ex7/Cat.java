package Ex7;

import Ex6.IAnimal;


public class Cat implements IAnimal, IDomestic {
    final String CatName;

    public Cat(String catName) {
        CatName = catName;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void PrintName() {
        System.out.println("Cat`s name is " + CatName);
    }
}
