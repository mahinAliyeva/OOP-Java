package lesson19;

public abstract class Human {
    protected String id;
    protected String name;
    protected int age;
    protected String email;
    protected String phone;

    public Human(String id, String name, int age, String email, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
