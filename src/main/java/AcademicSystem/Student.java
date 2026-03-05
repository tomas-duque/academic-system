package AcademicSystem;

import java.util.List;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    // Atributes

    private int id;
    private String name;
    private String lastName;
    private String email;
    private boolean status;

    // Constructores

    public Student(int id, String name, String lastName, String email, boolean status) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.status = status;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    //Methods

    public Student createStudent(Student student){

        System.out.println("Ingrese el id del Estudiante: ");
        int id = sc.nextInt();
        student.setId(id);
        sc.nextLine();

        System.out.println("Ingrese el nombre del Estudiante: ");
        String name = sc.nextLine();
        student.setName(name);
        sc.nextLine();

        System.out.println("Ingrese el apellido del Estudiante: ");
        String lastname = sc.next();
        student.setLastName(lastName);
        sc.nextLine();

        System.out.println("Ingrese el email del Estudiante: ");
        String email = sc.next();
        student.setEmail(email);
        sc.nextLine();

        System.out.println("Ingrese el estado del Estudiante: ");
        boolean status = sc.nextBoolean();
        student.setStatus(status);
        sc.nextLine();

        return student;
    }

    public void getStudentById(int id){

        if (id == this.id){
            System.out.println("id:" + this.id + "\n" +
                    "Nombre:" + this.name + "\n" +
                    "Apellido:" + this.lastName + "\n" +
                    "email:" + this.email + "\n" +
                    "status:" + this.status);
        }else{
            System.out.println("Id no encontrado: ");
        }

    }

    public List<Student> getAllStudents(){
        return null;
    }

    public Student updateStudent(Student student){

        System.out.println("Ingrese el nuevo email del estudiante: ");
        String email = sc.next();
        student.setEmail(email);

        System.out.println("Ingrese el nuevo estado del estudiante: ");
        boolean status = sc.nextBoolean();
        student.setStatus(status);

        return student;
    }

    public void deleteStudent(int id){

        if(id == this.id){
            System.out.println("Estudiante eliminado");
        }
    }
}

