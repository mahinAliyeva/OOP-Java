package lesson19;

public class Exam {
    private String examId;
    private Course course;
    private Student student;
    private int score;

    public Exam(String examId, Course course, Student student, int score) {
        this.examId = examId;
        this.course = course;
        this.student = student;
        this.score = score;
    }

    public String getExamId() {
        return examId;
    }
}