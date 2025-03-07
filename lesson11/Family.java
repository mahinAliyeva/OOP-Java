package lesson11;

import java.util.Random;

public class Family implements HumanCreator {
    private Human mother;
    private Human father;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    @Override
    public Human bornChild() {
        Random random = new Random();
        boolean isBoy = random.nextBoolean();
        String[] boyNames = {"Ali", "David", "John"};
        String[] girlNames = {"Aisha", "Emma", "Sophia"};

        String childName = isBoy ? boyNames[random.nextInt(boyNames.length)] : girlNames[random.nextInt(girlNames.length)];
        int childIQ = (mother.getIq() + father.getIq()) / 2;

        return isBoy ? new Man(childName, father.getSurname(), 2025, childIQ, null) :
                new Woman(childName, father.getSurname(), 2025, childIQ, null);
    }
}