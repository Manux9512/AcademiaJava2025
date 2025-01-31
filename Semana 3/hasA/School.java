package hasA;

import java.util.ArrayList;
import java.util.List;

public class School {
    String name;
    List<Teacher> teachersList = new ArrayList<>();
    List<Student> studentsList = new ArrayList<>();

    public School(String name) {
        this.name = name;
        studentsList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "School [name=" + name + "]";
    }

    void setTeacher(Teacher teacher){
        teachersList.add(teacher);
    }

    void setStudentsList(List<Student> studentsList){
        this.studentsList = studentsList;
    }

}
