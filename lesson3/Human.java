import java.util.Random;

public class Human
{
    public String name;
    public String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human() {}

    public Human(String name, String surname, int year)
    {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother)
    {
        this(name, surname, year);
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, int iq, Human father, Human mother, Pet pet, String[][] schedule)
    {
        this(name, surname, year, father, mother);
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }

    public void greetPet()
    {
        System.out.println("Hello, " + this.pet.nickname);
    }

    public void describePet()
    {
        String slyness = (this.pet.trickLevel > 50) ? "very sly" : "almost not sly";
        System.out.println("I have a " + this.pet.species + ", it is " + this.pet.age + " years old, it is " + slyness);
    }

    public boolean feedPet(boolean timeForFeeding)
    {
        Random random = new Random();
        int randomNum = random.nextInt(101);

        if (timeForFeeding || this.pet.trickLevel > randomNum)
        {
            System.out.println("Hm... I will feed " + this.name + "'s " + this.pet.species);
            return true;
        }
        else
        {
            System.out.println("I think " + this.name + "'s " + this.pet.species + " is not hungry.");
            return false;
        }
    }

    @Override
    public String toString()
    {
        return "Human{name='" + this.name + "', surname='" + this.surname + "', year=" + this.year +
                ", iq=" + this.iq + ", mother=" + (this.mother != null ? this.mother.name + " " + this.mother.surname : "unknown") +
                ", father=" + (this.father != null ? this.father.name + " " + this.father.surname : "unknown") +
                ", pet=" + (this.pet != null ? this.pet.toString() : "no pet") + "}";
    }
}
