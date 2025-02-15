package lesson5;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Sarah", "Connor", 1975);
        Human father = new Human("John", "Connor", 1973);
        Family family = new Family(mother, father);

        Human child = new Human("Tom", "Connor", 2005);
        family.addChild(child);

        System.out.println(family);
        System.out.println("Family size: " + family.countFamily());

        family.deleteChild(0);
        System.out.println("After removing child: " + family);
    }
}
