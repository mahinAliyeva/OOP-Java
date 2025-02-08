import java.util.Arrays;

public class Pet
{
    String species;
    public String nickname;
    int age;
    int trickLevel;
    String[] habits;

    public Pet() {}

    public Pet(String species, String nickname)
    {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits)
    {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat()
    {
        System.out.println("I am eating");
    }

    public void respond()
    {
        System.out.println("Hello, owner. I am " + this.nickname + ". I miss you!");
    }

    public void foul()
    {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString()
    {
        return this.species + "{nickname='" + this.nickname + "', age=" + this.age +
                ", trickLevel=" + this.trickLevel + ", habits=" + Arrays.toString(this.habits) + "}";
    }
}
