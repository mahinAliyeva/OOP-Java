package lesson11;

public class Fish extends Pet {
    public Fish(String nickname, int age, int trickLevel) {
        super(nickname, age, trickLevel);
        setSpecies(Species.FISH);
    }

    @Override
    public void respond() {
        System.out.println("Blub! I am " + getNickname() + " the Fish.");
    }
}