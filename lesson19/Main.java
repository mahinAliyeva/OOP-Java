package lesson19;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            Student[] students = new Student[5];
            Teacher[] teachers = new Teacher[2];
            Course[] courses = new Course[10];
            Exam[] exams = new Exam[10];

            teachers[0] = new Teacher("T1", "Ali", 35, "ali@example.com", "555-1111", "Math");
            teachers[1] = new Teacher("T2", "Veli", 40, "veli@example.com", "555-2222", "Physics");

            for (int i = 0; i < 5; i++) {
                students[i] = new Student("S" + i, "Student" + i, 20 + i, "s" + i + "@mail.com", "12345");
            }

            int courseIndex = 0;
            int examIndex = 0;
            for (int i = 0; i < students.length; i++) {
                Course c1 = new Course("C" + courseIndex, "Math" + courseIndex, teachers[0]);
                Course c2 = new Course("C" + (courseIndex + 1), "Physics" + (courseIndex + 1), teachers[1]);

                c1.enrollStudent(students[i]);
                c2.enrollStudent(students[i]);

                c1.grade(students[i], 70 + i);
                c2.grade(students[i], 80 + i);

                courses[courseIndex] = c1;
                courses[courseIndex + 1] = c2;

                exams[examIndex++] = new Exam("E" + examIndex, c1, students[i], 70 + i);
                exams[examIndex++] = new Exam("E" + examIndex, c2, students[i], 80 + i);

                courseIndex += 2;
            }

            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("students.json"), students);
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("teachers.json"), teachers);
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("courses.json"), courses);
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("exams.json"), exams);

            System.out.println("JSON files were created!");

        } catch (Exception e) {
            System.err.println("STOP: " + e.getMessage());
        }
    }
}
