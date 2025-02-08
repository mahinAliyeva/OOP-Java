public class Main
{
    public static void main(String[] args)
    {
        Pet pet1 = new Pet();
        Pet pet2 = new Pet("cat", "Whiskers");
        String[] habits = {"barking", "running", "digging"};
        Pet pet3 = new Pet("dog", "Buddy", 3, 60, habits);

        Human mother1 = new Human("Sarah", "Connor", 1975);
        Human father1 = new Human("John", "Connor", 1973, mother1, null);
        Human mother2 = new Human("Emily", "Smith", 1980, null, null);

        String[][] schedule1 = {
                {"Monday", "School"},
                {"Tuesday", "Swimming"},
                {"Wednesday", "Music Class"},
                {"Thursday", "Soccer"},
                {"Friday", "Reading Club"},
                {"Saturday", "Play with friends"},
                {"Sunday", "Rest"}
        };

        Human child1 = new Human("Tom", "Connor", 2005, 85, father1, mother1, pet3, schedule1);
        Human child2 = new Human("Anna", "Smith", 2008, 75, null, mother2, pet2, null);

        System.out.println("---- Family 1 ----");
        System.out.println(mother1);
        System.out.println(father1);
        System.out.println(child1);
        System.out.println(pet3);

        System.out.println("\n---- Family 2 ----");
        System.out.println(mother2);
        System.out.println(child2);
        System.out.println(pet2);

        System.out.println("\n---- Child 1 Actions ----");
        child1.greetPet();
        child1.describePet();
        pet3.eat();
        pet3.respond();
        pet3.foul();
        child1.feedPet(false); // Randomized feeding
        child1.feedPet(true); // Force feeding

        System.out.println("\n---- Child 2 Actions ----");
        child2.greetPet();
        child2.describePet();
        pet2.eat();
        pet2.respond();
    }
}
