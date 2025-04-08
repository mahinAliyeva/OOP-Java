package lesson19;

public class Course implements Gradable {
    private String courseId;
    private String courseName;
    private Teacher teacher;
    private Student[] students;
    private int[] scores;
    private int studentCount;

    public Course(String courseId, String courseName, Teacher teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = new Student[10];
        this.scores = new int[10];
        this.studentCount = 0;
        teacher.teach(this);
    }

    public void enrollStudent(Student student) {
        students[studentCount] = student;
        student.enrollCourse(this);
        studentCount++;
    }

    public void grade(Student student, int score) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i] == student) {
                scores[i] = score;
                student.receiveGrade(courseId, score);
                break;
            }
        }
    }

    public Student[] getStudents() {
        return students;
    }
}