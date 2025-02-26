package lesson10;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Alice", 101, 5);
        Manager manager2 = new Manager("Bob", 102, 8);
        Developer developer1 = new Developer("Charlie", 201, "Java");
        Developer developer2 = new Developer("David", 202, "Python");
        Designer designer1 = new Designer("Emma", 301, "Figma");
        Designer designer2 = new Designer("Sophia", 302, "Adobe XD");

        manager1.displayInfo();
        manager1.work();
        manager1.conductMeeting();
        
        System.out.println();
        
        manager2.displayInfo();
        manager2.work();
        manager2.conductMeeting();
        
        System.out.println();
        
        developer1.displayInfo();
        developer1.work();
        developer1.debugCode();
        
        System.out.println();
        
        developer2.displayInfo();
        developer2.work();
        developer2.debugCode();
        
        System.out.println();
        
        designer1.displayInfo();
        designer1.work();
        designer1.createMockups();
        
        System.out.println();
        
        designer2.displayInfo();
        designer2.work();
        designer2.createMockups();
    }
}
