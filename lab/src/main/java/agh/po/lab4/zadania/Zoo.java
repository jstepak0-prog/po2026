package agh.po.lab4.zadania;
import agh.po.lab4.animals.*;
import java.util.Random;

public class Zoo {

    Animal[] animals = new Animal[100];

    public Zoo() {
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {

            int los = rand.nextInt(3);

            if (los == 0) {
                animals[i] = new Parrot();
            } else if (los == 1) {
                animals[i] = new Dog();
            } else {
                animals[i] = new Snake();
            }
        }
    }

    public int sumLegs() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += animals[i].legs;
        }
        return sum;
    }

    public static void main(String[] args) {
        Zoo noweZoo = new Zoo();

        System.out.println(noweZoo.sumLegs());
    }
}
