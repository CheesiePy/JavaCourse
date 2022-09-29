package OOP.Lesson_two;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.setName("Pongo");
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(a);
        animals.get(0).setName("Chulla");
        System.out.println(animals.get(0).print());
        }
    }
