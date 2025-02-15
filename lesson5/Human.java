package lesson5;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    // Static block
    static {
        System.out.println("Loading class: Human");
    }

    // Non-static block
    {
        System.out.println("Creating new Human object");
    }

    // Constructors
    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    // Getters & Setters
    public Family getFamily() { return family; }
    public void setFamily(Family family) { this.family = family; }

    // Other methods
    public void greetPet() {
        if (family.getPet() != null) {
            System.out.println("Hello, " + family.getPet().getNickname());
        }
    }

    // equals & hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return year == human.year && name.equals(human.name) && surname.equals(human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year);
    }

    // toString
    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, schedule=%s}", name, surname, year, iq, Arrays.deepToString(schedule));
    }
}
