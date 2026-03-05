package AcademicSystem;

import java.util.Scanner;

public class Classroom {
    Scanner sc = new Scanner(System.in);

    private int id;
    private String classroomNumber;
    private int floor;
    private boolean status;
    private int capacity;

    // Constructores

    public Classroom(int id, String classroomNumber, int floor, boolean status, int capacity) {
        this.id = id;
        this.classroomNumber = classroomNumber;
        this.floor = floor;
        this.status = status;
        this.capacity = capacity;
    }

    //  Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Methods

    public Classroom createClassroom(Classroom classroom){

        System.out.println("Ingrese el id del aula: ");
        int id = sc.nextInt();
        classroom.setId(id);
        sc.nextLine();

        System.out.println("Ingrese el numero del aula: ");
        String classroomNumber = sc.nextLine();
        classroom.setClassroomNumber(classroomNumber);

        System.out.println("Ingrese el piso del aula: ");
        int floor = sc.nextInt();
        classroom.setFloor(floor);

        System.out.println("Ingrese el estado del aula: ");
        boolean status = sc.nextBoolean();
        classroom.setStatus(status);

        System.out.println("Ingrese la capacidad del aula: ");
        int capacity = sc.nextInt();
        classroom.setCapacity(capacity);

        return classroom;
    }

    public void getClassroomById(int id) {

        if (id == this.id) {

            System.out.println("Id: " + this.id + "\n" +
                            "numero aula: " + this.classroomNumber + "\n" +
                            "Piso: " + this.floor + "\n" +
                            "Status: " + this.status + "\n" +
                            "Capacidad: " + this.capacity);
        }else {
            System.out.println("Id no encontrado: ");
        }
    }

    public Classroom updateClassroom(Classroom classroom){

            System.out.println("Ingrese el nuevo estado del aula: ");
            boolean status = sc.nextBoolean();
            classroom.setStatus(status);

            System.out.println("Ingrese la nueva capacidad del aula: ");
            int capacity = sc.nextInt();
            classroom.setCapacity(capacity);

            return classroom;
    }

    public void deleteClassroom(int id){

        if (id == this.id) {
            System.out.println("Aula eliminada");
        }

    }
}