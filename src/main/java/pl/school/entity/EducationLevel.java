package pl.school.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EducationLevel {

    int numberOfStudents;
    int levelOfEducation; // like 1, 2 etc
    int id;
    String name; // 1a, 1b
    Teacher teacher; //as a tutor
    List<Student> studentList = new ArrayList<>();



}
