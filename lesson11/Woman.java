package lesson11;

public final class Woman extends Human {
    public Woman(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println("Hi sweetie, let's cuddle!");
    }

    public void doMakeup() {
        System.out.println("Applying makeup...");
    }
}