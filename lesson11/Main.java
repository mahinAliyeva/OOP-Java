package lesson11;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, 70);
        DomesticCat cat = new DomesticCat("Whiskers", 2, 50);
        Fish fish = new Fish("Nemo", 1, 30);
        RoboCat roboCat = new RoboCat("R2Meow", 5, 90);

        dog.respond();
        cat.respond();
        fish.respond();
        roboCat.respond();

        //Foul Interface
        dog.foul();
        cat.foul();

        System.out.println("\nPet Species Details");
        System.out.println("Dog can fly? " + dog.getSpecies().canFly());
        System.out.println("Fish has fur? " + fish.getSpecies().hasFur());
        System.out.println("RoboCat number of legs: " + roboCat.getSpecies().getNumberOfLegs());

        String[][] schedule = {{"Monday", "Work"}, {"Tuesday", "Gym"}};
        Man father = new Man("John", "Doe", 1980, 120, schedule);
        Woman mother = new Woman("Emma", "Doe", 1985, 110, schedule);

        father.greetPet();
        mother.greetPet();

        father.repairCar();
        mother.doMakeup();

        Family family = new Family(mother, father);
        Human child = family.bornChild();
        System.out.println("\nA Child is Born!");
        System.out.println("New child: " + child.getClass().getSimpleName() + " - " + child);

        Dog dog2 = new Dog("Buddy", 3, 70);
        System.out.println("dog.equals(dog2): " + dog.equals(dog2));
        System.out.println("dog.hashCode(): " + dog.hashCode());
        System.out.println("dog2.hashCode(): " + dog2.hashCode());

//        System.out.println("\n--- Garbage Collector Stress Test ---");
//        System.out.println("Starting stress test for garbage collector...");
//        for (int i = 0; i < 1_000_000; i++) {
//            new Human("Temp", "User", 2000, 100, null);
//        }

        System.gc();
    }
}