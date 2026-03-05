package AcademicSystem;

import java.util.Scanner;

public class Course {
    Scanner sc = new Scanner(System.in);

    // Atributes
    private int id;
    private String name;
    private String program;
    private String school;
    private Teacher teacher;
    private String startDate;
    private String endDate;

    // Constructores

    public Course(int id, String name, String program, String school, Teacher teacher, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.program = program;
        this.school = school;
        this.teacher = teacher;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    // Methods
    public Course createCourse(Course course){

        System.out.println("Ingrese el id del curso: ");
        int id = sc.nextInt();
        course.setId(id);
        sc.nextLine();

        System.out.println("Ingrese el nombre del curso: ");
        String name = sc.nextLine();
        course.setName(name);

        System.out.println("Ingrese el programa del curso: ");
        String program = sc.nextLine();
        course.setProgram(program);

        System.out.println("Ingrese la escuela del curso: ");
        String school = sc.nextLine();
        course.setSchool(school);

        System.out.println("Ingrese el profesor del curso: ");
        course.setTeacher(teacher);

        System.out.println("Ingrese fecha de inicio del curso: ");
        String startDate = sc.nextLine();
        course.setStartDate(startDate);

        System.out.println("Ingrese fecha de fin del curso: ");
        String endDate = sc.nextLine();
        course.setEndDate(endDate);

        return course;
    }

    public void getCourseById(int id){

        if(id == this.id){

            System.out.println("Id: " + this.id + "\n" +
                            "Nombre: " + this.name + "\n" +
                            "Programa: " + this.program + "\n" +
                            "Escuela: " + this.school + "\n" +
                            "Profesor: " + this.teacher + "\n" +
                            "Fecha inicio: " + this.startDate + "\n" +
                            "Fecha fin: " + this.endDate);

        }else {
            System.out.println("Id no encontrado: ");
        }
    }

    public Course updateCourse(Course course){

        System.out.println("Ingrese la nueva fecha de inicio: ");
        String startDate = sc.nextLine();
        course.setStartDate(startDate);

        System.out.println("Ingrese la nueva fecha de fin: ");
        String endDate = sc.nextLine();
        course.setEndDate(endDate);

        return course;
    }

    public void deleteCourse(int id){


    }
}
