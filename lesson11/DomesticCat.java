package lesson11;

public class DomesticCat extends Pet implements Foul {
    public DomesticCat(String nickname, int age, int trickLevel) {
        super(nickname, age, trickLevel);
        setSpecies(Species.DOMESTIC_CAT);
    }

    @Override
    public void respond() {
        System.out.println("Meow! I am " + getNickname() + " the Cat.");
    }

    @Override
    public void foul() {
        System.out.println(getNickname() + " scratched the furniture.");
    }
}