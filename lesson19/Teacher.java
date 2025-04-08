package lesson19;

public class Teacher extends Human implements Teachable {
    private String subject;
    private Course[] taughtCourses;
    private int courseCount;

    public Teacher(String id, String name, int age, String email, String phone, String subject) {
        super(id, name, age, email, phone);
        this.subject = subject;
        this.taughtCourses = new Course[10];
        this.courseCount = 0;
    }

    public void teach(Course course) {
        taughtCourses[courseCount] = course;
        courseCount++;
    }

    public Course[] getTaughtCourses() {
        return taughtCourses;
    }
}