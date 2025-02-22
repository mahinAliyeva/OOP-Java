package lesson7;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String[][] schedule;

    static {
        System.out.println("Loading class: Human");
    }

    {
        System.out.println("Creating new Human object");
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Family getFamily() { return family; }
    public void setFamily(Family family) { this.family = family; }

    public String[][] getSchedule() { return schedule; }

    public void greetPet() {
        if (family.getPet() != null) {
            System.out.println("Hello, " + family.getPet().getNickname());
        }
    }

    @Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("finalize() method is not supported in this class.");
        //System.out.println("Human object is removed.");
        //super.finalize; since it is empty, there is no point in calling it
    }

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

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, schedule=%s}", name, surname, year, iq, Arrays.deepToString(schedule));
    }
}