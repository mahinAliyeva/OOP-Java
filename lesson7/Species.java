package lesson7;

public enum Species {
    DOG(false, 4, true),
    CAT(false, 4, true),
    PARROT(true, 2, false),
    FISH(false, 0, false),
    SNAKE(false, 0, false),
    SPIDER(false, 8, false),
    HAMSTER(false, 4, true),
    EAGLE(true, 2, false),
    HORSE(false, 4, true);

    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public boolean canFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean hasFur() {
        return hasFur;
    }
}
