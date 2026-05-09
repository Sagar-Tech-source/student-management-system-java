package personal.project.Services;
import personal.project.models.Students;
import java.util.ArrayList;

public class StudentServices {
    ArrayList<Students> students = new ArrayList<>();

    public void addStudent(Students s) {
        students.add(s);
    }

    public void showStudents() {
        for (Students s : students) {
            System.out.println(s);
        }
    }

}
