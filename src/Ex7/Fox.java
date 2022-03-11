package Ex7;

import Ex6.IAnimal;

public class Fox implements IAnimal, IWild {
    final String FoxName;

    public Fox(String foxName) {
        FoxName = foxName;
    }

    @Override
    public void sound() {
        System.out.println("Wa-pow");
    }

    @Override
    public void PrintName() {
        System.out.println("Fox`s name is " + FoxName);
    }
}
