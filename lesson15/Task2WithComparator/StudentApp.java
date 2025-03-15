package lesson15.Task2WithComparator;


import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student(13L, "Aysel", "Aliyeva", true, 100,2000);
        Student s2 = new Student(5L, "Selim", "Babayev", false, 100,2000);
        Student s3 = new Student(12L, "Hicran", "Ceferove", true, 99,2001);
        Student s4 = new Student(7L, "Shukur", "Qedirov", true, 50,1998);
        Student s5 = new Student(8L, "Aytac", "Abdullayeva", true, 75,1956);
        Student s6 = new Student(11L, "Nicat", "Shinirov", true, 75,1999);
        Student s7 = new Student(3L, "Firuze", "Huseynova", false, 99,2002);
        Student s8 = new Student(2L, "Leyla", "Hasanova", false, 50,1899);
        Student s9 = new Student(4L, "Hasanali", "Ismayilov", true, 75,1940);
        Student s10 = new Student(9L, "Ibrahimbey", "Khalilov", true, 75.1,2005);
        Student[] students = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
        Checker checker = new Checker();
        Arrays.sort(students, checker);
        for (Student student : students) {
            System.out.println(student);

        }
        Arrays.sort(students);
        System.out.println("--------------------------------------------------");
        for (Student student : students) {
            System.out.println(student);

        }

    }
}