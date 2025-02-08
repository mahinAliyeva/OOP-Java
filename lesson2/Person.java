public class Person {
    private String name;
    private int age;
    private String email;
    private char gender;
    private String city;

    // Constructor
    public Person(String name, int age, String email, char gender, String city) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.city = city;
    }

    // Method to return a greeting message
    public String greet() {
        return "Hello, my name is " + this.name + " from " + this.city + "! Nice to meet you!";
    }

    // Method to celebrate birthday and increase age
    public void celebrateBirthday() {
        this.age++;
        System.out.println("Happy Birthday, " + this.name + "! You are now " + this.age + " years old.");
    }

    // Method to relocate to a new city
    public void relocate(String newCity) {
        System.out.println(this.name + " is moving from " + this.city + " to " + newCity + "!");
        this.city = newCity;
    }

    // Method to check if the person is an adult
    public boolean isAdult() {
        return this.age >= 18;
    }

    // Method to get person's details
    public String getDetails() {
        return "Name: " + this.name + ", Age: " + this.age + ", Email: " + this.email + ", Gender: " + this.gender + ", City: " + this.city;
    }

    // Main method to test functionalities
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25, "alice@example.com", 'F', "New York");
        Person p2 = new Person("Alice", 25, "alice@example.com", 'F', "New York");

        // Comparing objects using default equals()
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // Should return false (different instances)

        // Comparing hash codes using default hashCode()
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());

        // Calling the new methods
        System.out.println(p1.greet());          // Greeting message
        System.out.println("Is Alice an adult? " + p1.isAdult()); // Checking adulthood

        p1.celebrateBirthday(); // Birthday message
        p1.relocate("Los Angeles"); // Moving to a new city

        // Display updated details
        System.out.println("Updated details: " + p1.getDetails());
    }
}
