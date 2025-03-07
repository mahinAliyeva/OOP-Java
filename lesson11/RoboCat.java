package lesson11;

public class RoboCat extends Pet {
    public RoboCat(String nickname, int age, int trickLevel) {
        super(nickname, age, trickLevel);
        setSpecies(Species.ROBOCAT);
    }

    @Override
    public void respond() {
        System.out.println("Beep Boop! I am " + getNickname() + " the RoboCat.");
    }
}