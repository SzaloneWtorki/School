package pl.school.classes.model;

import lombok.Data;
import pl.school.SchoolStaff.Model.Teacher;

import java.util.ArrayList;

@Data
public class ClassOfSchool {

    int numberOfStudents;
    int levelOfEducation; // like 1, 2 etc
    int id;
    String name; // 1a, 1b
    Teacher teacher; //as a tutor
    List <Student> studentList = new ArrayList<>();


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
