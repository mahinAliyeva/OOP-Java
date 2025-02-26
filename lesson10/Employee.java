package lesson10;

abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method (unconcrete)
    abstract void work();

    // Concrete method (normal method)
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}