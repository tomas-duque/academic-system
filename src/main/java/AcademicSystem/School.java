package AcademicSystem;

import java.util.Scanner;

public class School {
    Scanner sc = new Scanner(System.in);
    // Atributes
    private int id;
    private String name;
    private String director;

    // Constructores

    public School(int id, String name, String director) {
        this.id = id;
        this.name = name;
        this.director = director;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    // Methods
    public School createSchool(School school){

        System.out.println("Ingrese el id de la escuela: ");
        int id = sc.nextInt();
        school.setId(id);
        sc.nextLine();

        System.out.println("Ingrese el nombre de la escuela: ");
        String name = sc.nextLine();
        school.setName(name);

        System.out.println("Ingrese el director de la escuela: ");
        String director = sc.nextLine();
        school.setDirector(director);

        return school;
    }

    public void getSchoolById(int id){

        if(id == this.id){
            System.out.println("Id: " + this.id);
            System.out.println("Nombre: " + this.name);
            System.out.println("Director: " + this.director);
        }else {
            System.out.println("Id no encontrado: ");
        }

    }

    public School updateSchool(School school){

        System.out.println("Ingrese el nuevo nombre de la escuela: ");
        String name = sc.nextLine();
        school.setName(name);

        System.out.println("Ingrese el nuevo director: ");
        String director = sc.nextLine();
        school.setDirector(director);

        return school;
    }

    public void deleteSchool(int id){

        if(id == this.id){
            System.out.println("Escuela eliminada");
        }

    }
}
