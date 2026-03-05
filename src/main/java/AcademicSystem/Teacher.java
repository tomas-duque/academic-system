package AcademicSystem;

import java.util.Scanner;

public class Teacher {
    Scanner sc = new Scanner(System.in);
    // Atributes
    private int id;
     private String name;
     private String lastName;
    private String email;
    private String specialty;
    private boolean status;

    // Constructores

    public Teacher(int id, String name, String lastName, String email, String specialty, boolean status) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.specialty = specialty;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Methods
    public Teacher createTeacher(Teacher teacher){

        return teacher;
    }

    public void getTeacherById(int id){

        if(id == this.id){

            System.out.println("Id: " + this.id);
            System.out.println("Nombre: " + this.name);
            System.out.println("Apellido: " + this.lastName);
            System.out.println("Email: " + this.email);
            System.out.println("Especialidad: " + this.specialty);
            System.out.println("Estado: " + this.status);

        }else{
            System.out.println("Id no encontrado: ");
        }
    }

    public Teacher updateTeacher(Teacher teacher){

        System.out.println("Ingrese el nuevo email del profesor: ");
        String email = sc.nextLine();
        teacher.setEmail(email);

        System.out.println("Ingrese la nueva especialidad del profesor: ");
        String specialty = sc.nextLine();
        teacher.setSpecialty(specialty);

        System.out.println("Ingrese el nuevo estado del profesor: ");
        boolean status = sc.nextBoolean();
        sc.nextLine();
        teacher.setStatus(status);

        return teacher;
    }

    public void deleteTeacher(int id){

        if(id == this.id){
            System.out.println("Profesor eliminado");
        }
    }
}
