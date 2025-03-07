package lesson11;

public class Dog extends Pet implements Foul {
    public Dog(String nickname, int age, int trickLevel) {
        super(nickname, age, trickLevel);
        setSpecies(Species.DOG);
    }

    @Override
    public void respond() {
        System.out.println("Woof! I am " + getNickname() + " the Dog.");
    }

    @Override
    public void foul() {
        System.out.println(getNickname() + " has made a mess!");
    }
}