package personal.project;

import personal.project.Services.StudentServices;
import personal.project.models.Students;

public class Main {
    public static void main(String[] args) {

        StudentServices service = new StudentServices();

        service.addStudent(new Students(1, "Sagar", 20));
        service.addStudent(new Students(2, "Rahul", 21));

        service.showStudents();
    }
}