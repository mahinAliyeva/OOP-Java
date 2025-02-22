package lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Anna", "Smith", 1985, 120, new String[][]{
                {DayOfWeek.MONDAY.name(), "Yoga"},
                {DayOfWeek.WEDNESDAY.name(), "Piano"},
                {DayOfWeek.FRIDAY.name(), "Cooking Class"}
        });

        Human father = new Human("John", "Smith", 1980, 130, new String[][]{
                {DayOfWeek.TUESDAY.name(), "Football"},
                {DayOfWeek.THURSDAY.name(), "Work Meeting"}
        });

        Family family = new Family(mother, father);
        System.out.println("Family created: " + family);

        Human child1 = new Human("Emma", "Smith", 2010, 110, new String[][]{
                {DayOfWeek.SATURDAY.name(), "Dance Class"},
                {DayOfWeek.SUNDAY.name(), "Swimming"}
        });

        family.addChild(child1);
        assert family.countFamily() == 3 : "Test failed: addChild() didn't work!";
        System.out.println("addChild() test passed!");

        boolean removed = family.deleteChild(child1);
        assert removed : "Test failed: deleteChild(Human) didn't remove the child!";
        assert family.countFamily() == 2 : "Test failed: deleteChild(Human) didn't update count!";
        System.out.println("deleteChild(Human) test passed!");

        // Test deleteChild(int index) - Positive Case
        Human child2 = new Human("Lucas", "Smith", 2012, 100, new String[][]{
                {DayOfWeek.WEDNESDAY.name(), "Math Club"}
        });

        family.addChild(child2);
        assert family.countFamily() == 3 : "Test failed: addChild() didn't increase count!";

        boolean removedByIndex = family.deleteChild(0);
        assert removedByIndex : "Test failed: deleteChild(int) didn't remove the child!";
        assert family.countFamily() == 2 : "Test failed: deleteChild(int) didn't update count!";
        System.out.println("deleteChild(int) positive test passed!");

        // Test deleteChild(int index) - Negative Case (Out of Bounds)
        boolean removedInvalidIndex = family.deleteChild(5);
        assert !removedInvalidIndex : "Test failed: deleteChild(int) should return false for invalid index!";
        assert family.countFamily() == 2 : "Test failed: deleteChild(int) altered the family incorrectly!";
        System.out.println("deleteChild(int) negative test passed!");

        // Test countFamily()
        assert family.countFamily() == 2 : "Test failed: countFamily() didn't return the correct count!";
        System.out.println("countFamily() test passed!");

        // Pet class tests:
        Pet pet1 = new Pet(Species.DOG, "Buddy", 3, 80);
        Pet pet2 = new Pet(Species.DOG, "Buddy", 3, 80);
        Pet pet3 = new Pet(Species.CAT, "Kitty", 2, 70);

        System.out.println("Pet1: " + pet1);
        System.out.println("Pet2: " + pet2);
        System.out.println("Pet3: " + pet3);

        // Testing equals() method
        System.out.println("pet1 equals pet2? " + pet1.equals(pet2)); // should be true
        System.out.println("pet1 equals pet3? " + pet1.equals(pet3)); // should be false

        // Testing hashCode() consistency
        System.out.println("Hashcode of pet1: " + pet1.hashCode());
        System.out.println("Hashcode of pet2: " + pet2.hashCode());
        System.out.println("Hashcode of pet3: " + pet3.hashCode());

        assert mother.getSchedule()[0][0].equals(DayOfWeek.MONDAY.name()) : "Test failed: Schedule enum usage incorrect!";
        System.out.println("DayOfWeek enum test passed!");

        // Stress test for garbage collector
        System.out.println("Starting stress test for garbage collector...");
        for (int i = 0; i < 10_000_000; i++) {
            new Human("Temp", "User", 2000, 100, null);
        }
        System.gc();
        System.out.println("Garbage collector stress test completed!");
    }
}