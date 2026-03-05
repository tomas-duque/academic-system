package AcademicSystem;

import java.util.Scanner;

public class Enrollment {
    Scanner sc = new Scanner(System.in);

    // Atributes

    private int id;
    private String date;
    private Student student;
    private Course course;
    private Classroom classroom;
    private boolean status;

    // Constructores

    public Enrollment(int id, String date, Student student, Course course, Classroom classroom, boolean status) {
        this.id = id;
        this.date = date;
        this.student = student;
        this.course = course;
        this.classroom = classroom;
        this.status = status;
    }

    //Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Methods

    public void createEnrollment(){
        System.out.println("Matricula creada exitosamente");
    }

    public void getEnrollmentById(int id){
        if(id == this.id){
            System.out.println("Matricula encontrada");
        }
    }

    public Enrollment updateEnrollment(Enrollment enrollment){
        if(enrollment.id == this.id){
            this.date = enrollment.date;
            this.student = enrollment.student;
            this.course = enrollment.course;
            this.classroom = enrollment.classroom;
            this.status = enrollment.status;
        }
        return this;
    }

    public void deleteEnrollment(int id) {
        if (id == this.id) {
            System.out.println("Enrollment deleted");
        }
    }
}
