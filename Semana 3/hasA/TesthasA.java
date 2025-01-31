package hasA;

import java.util.ArrayList;
import java.util.List;

public class TesthasA {
    public static void main(String[] args) {
        School school1 = new School("Puebla");

        System.out.println(school1.teachersList);

        //Creación de profesores
        school1.setTeacher(new Teacher("T. Fisica"));
        school1.setTeacher(new Teacher("T. Matematicas"));
        school1.setTeacher(new Teacher("T. Literatura"));

        System.out.println(school1.teachersList);

        //Creación de estudiantes
        Student student1 = new Student("Juan");
        Student student2 = new Student("Alfredo");
        Student student3 = new Student("Rodolfo");

        student1.parents = new Parents("Rocio");
        student1.payment(1000);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);

        System.out.println(school1.studentsList);
        //Se asigna la lista de estudiantes a la escuela
        school1.setStudentsList(studentsList);
        System.out.println(school1.studentsList);

        //school1 = null;
        //System.out.println(school1);

    }
}
