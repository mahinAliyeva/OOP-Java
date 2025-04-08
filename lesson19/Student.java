package lesson19;

public class Student extends Human {
    private Course[] enrolledCourses;
    private String[] courseIds;
    private int[] grades;
    private int courseCount;

    public Student(String id, String name, int age, String email, String phone) {
        super(id, name, age, email, phone);
        this.enrolledCourses = new Course[10];
        this.courseIds = new String[10];
        this.grades = new int[10];
        this.courseCount = 0;
    }

    public void enrollCourse(Course course) {
        enrolledCourses[courseCount] = course;
        courseCount++;
    }

    public void receiveGrade(String courseId, int score) {
        for (int i = 0; i < courseCount; i++) {
            if (courseIds[i] == null) {
                courseIds[i] = courseId;
                grades[i] = score;
                break;
            }
        }
    }

    public Course[] getEnrolledCourses() {
        return enrolledCourses;
    }
}