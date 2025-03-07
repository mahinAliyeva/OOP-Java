package lesson11;

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

    public void greetPet() {
        System.out.println("Hello, my dear pet!");
    }

    public int getIq() {
        return iq;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", Year: " + year + ", IQ: " + iq;
    }

//    This does not function in new versions of Java
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Human object deleted: " + name);
//    }
}