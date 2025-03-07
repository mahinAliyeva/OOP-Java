package lesson11;

public final class Man extends Human {
    public Man(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println("Hey buddy, let's go for a run!");
    }

    public void repairCar() {
        System.out.println("Fixing the car...");
    }
}