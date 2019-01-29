package pl.school.classes.model;

import lombok.Data;
import pl.school.schoolStaff.Model.Teacher;
import pl.school.student.Student;

import java.util.ArrayList;
import java.util.List;

@Data
public class Classroom {

    int numberOfStudents;
    int levelOfEducation; // like 1, 2 etc
    int id;
    String name; // 1a, 1b
    Teacher teacher; //as a tutor
    List<Student> studentList = new ArrayList<>();


    @Override
    public String toString() {
        return "ClassOfSchool{" +
                "numberOfStudents=" + numberOfStudents +
                ", levelOfEducation=" + levelOfEducation +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
